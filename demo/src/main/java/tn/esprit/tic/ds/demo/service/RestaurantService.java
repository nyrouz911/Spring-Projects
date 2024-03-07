package tn.esprit.tic.ds.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.ds.demo.repository.RestaurantRepository;

@Service
@AllArgsConstructor
public class RestaurantService implements  IRestaurantService {
    RestaurantRepository restaurantRepository;
}
