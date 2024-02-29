package tn.esprit.tic.ds.demo.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.tic.ds.demo.entity.Commande;
import tn.esprit.tic.ds.demo.entity.Restaurant;

import java.time.LocalDate;
import java.util.List;

public interface RestaurantRepository extends CrudRepository<Restaurant,Long> {
    List<Restaurant> FindByNbPlacesMaxGreaterThanAndChaineRestaurationDateCreationLessThan(Long capacity, LocalDate date);
}
