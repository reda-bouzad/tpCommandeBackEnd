package maroc.fst.tp_commande.webservice.provided;

import jakarta.persistence.Access;
import jakarta.transaction.Transactional;
import maroc.fst.tp_commande.bean.Commande;
import maroc.fst.tp_commande.service.facade.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/commande")
public class CommandeWs {
    @Autowired
    private CommandeService commandeService;
    @GetMapping("/reference/{reference}")
    public Commande findByReference(@PathVariable String reference) {
        return commandeService.findByReference(reference);
    }

    @Transactional
    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return commandeService.deleteByReference(reference);
    }
    @GetMapping("/")
    public List<Commande> findAll() {
        return commandeService.findAll();
    }
    @PostMapping("/")
    public Commande save(@RequestBody  Commande commande) {
        Commande save = commandeService.save(commande);
        return save;
    }
}
