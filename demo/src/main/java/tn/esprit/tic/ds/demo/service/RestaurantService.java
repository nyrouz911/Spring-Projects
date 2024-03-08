package tn.esprit.tic.ds.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.ds.demo.entity.ChaineRestauration;
import tn.esprit.tic.ds.demo.entity.Restaurant;
import tn.esprit.tic.ds.demo.repository.ChaineRestaurationRepository;
import tn.esprit.tic.ds.demo.repository.MenuRepository;
import tn.esprit.tic.ds.demo.repository.RestaurantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class RestaurantService implements  IRestaurantService {
    RestaurantRepository restaurantRepository;
    ChaineRestaurationRepository    chaineRestaurationRepository;
    MenuRepository menuRepository;

    @Override
    public Restaurant affecterRestaurantAChaineRestauration(String nomRestaurant, String libelleChaine) {
        ChaineRestauration  chr = chaineRestaurationRepository.findByLibelle(libelleChaine);
        Restaurant restaurant = restaurantRepository.findByNom(nomRestaurant);
        restaurant.setChaineRestauration(chr);
        restaurantRepository.save(restaurant);

        return null;
    }

    @Override
    public Restaurant ajoutRestaurantEtMenuAssocies(Restaurant restaurant) {
        Restaurant restaurant1=restaurantRepository.save(restaurant);
        restaurant1.getMenus().forEach(menu ->
        {
            menu.setPrixTotal(20.00F);
            menuRepository.save(menu);
        });
        return null;
    }
}
