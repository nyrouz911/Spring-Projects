package tn.esprit.tic.ds.demo.service;

import tn.esprit.tic.ds.demo.entity.Restaurant;

public interface IRestaurantService {
    Restaurant affecterRestaurantAChaineRestauration(String nomRestaurant, String libelleChaine );
    Restaurant ajoutRestaurantEtMenuAssocies(Restaurant restaurant);

}
