package maroc.fst.tp_commande.dao;

import maroc.fst.tp_commande.bean.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeDao extends JpaRepository<Commande,Long> {
    Commande findByReference(String reference);
    int deleteByReference(String reference);
}
