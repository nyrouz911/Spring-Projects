package tn.esprit.tic.ds.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.ds.demo.entity.Commande;

import java.util.Date;
import java.util.List;
@Repository
public interface CommandeRepository extends CrudRepository<Commande,Long> {
    List<Commande> findByClientIdClient(Long idClient);
    List<Commande> findByClientIdClientAndDateCommandeBetween(Long idClient,Date dFrom, Date dTo);
    List<Commande> findByDateCommandeBetweenOrderByNote(Date dFrom, Date dTo);

}