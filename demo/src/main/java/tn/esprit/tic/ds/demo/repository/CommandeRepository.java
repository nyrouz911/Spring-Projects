package tn.esprit.tic.ds.demo.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.tic.ds.demo.entity.Commande;

import java.util.Date;
import java.util.List;

public interface CommandeRepository extends CrudRepository<Commande,Long> {
    List<Commande> findByClientClientId(Long idClient);
    List<Commande> findByDateCommandeBetween(Date dFrom, Date dTo);
    List<Commande> findByDateCommandeOrderByNoteBetween(Date dFrom, Date dTo);


}
