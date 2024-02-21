package tn.esprit.tic.ds.demo.repository;

import tn.esprit.tic.ds.demo.entity.Restaurant;

import java.time.LocalDate;
import java.util.List;

public interface RestaurantRepository {
    List<Restaurant> FindByNbPlacesMaxGreaterThanAndChaineRestaurationDateCreationLessThan(Long capacity, LocalDate date);
}
