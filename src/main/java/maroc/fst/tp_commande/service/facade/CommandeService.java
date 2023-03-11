package maroc.fst.tp_commande.service.facade;

import maroc.fst.tp_commande.bean.Commande;

import java.util.List;

public interface CommandeService {
    Commande findByReference(String reference);
    int deleteByReference(String reference);

    List<Commande> findAll();
    Commande save(Commande commande);

}
