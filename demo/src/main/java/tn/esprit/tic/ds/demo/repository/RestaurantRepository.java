package tn.esprit.tic.ds.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.ds.demo.entity.Commande;
import tn.esprit.tic.ds.demo.entity.Restaurant;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant,Long> {
    List<Restaurant> findByNbPlacesMaxGreaterThanAndChaineRestaurationDateCreationLessThan(Long capacity, LocalDate date);
    Restaurant  findByNom(String nom);
}
