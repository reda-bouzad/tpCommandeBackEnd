package maroc.fst.tp_commande.service.impl;

import maroc.fst.tp_commande.bean.Commande;
import maroc.fst.tp_commande.dao.CommandeDao;
import maroc.fst.tp_commande.service.facade.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CommandeServiceImpl implements CommandeService {
    @Autowired
    private CommandeDao commandeDao;

    @Override
    public Commande findByReference(String reference) {
        return commandeDao.findByReference(reference);
    }
    @Transactional
    @Override
    public int deleteByReference(String reference) {
        return commandeDao.deleteByReference(reference);
    }

    @Override
    public List<Commande> findAll() {
        return commandeDao.findAll();
    }

    @Override
    public Commande save(Commande commande) {
        Commande res = null;
        if (findByReference(commande.getReference()) == null) {
           return res = commandeDao.save(commande);
        } else {
            return res;
        }
    }

}
