package tn.esprit.tic.ds.demo.repository;

import org.springframework.data.jpa.repository.Query;
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
    @Query("SELECT c FROM Commande c WHERE YEAR(c.dateCommande) = :year ORDER BY c.note DESC")
    List<Commande>  findByDateCommandeYearOrderByNoteDesc(int year);
    @Query("SELECT c.menus.libelleMenu, COUNT(c) " +
            "FROM Commande c " +
            "GROUP BY c.menus.libelleMenu " +
            "ORDER BY COUNT(c) DESC")
    List<Object[]> findMostOrderedMenus();
}