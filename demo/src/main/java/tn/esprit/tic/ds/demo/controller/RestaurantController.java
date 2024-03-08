package tn.esprit.tic.ds.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tn.esprit.tic.ds.demo.service.IRestaurantService;

public class RestaurantController {
    IRestaurantService  restaurantService;

    //http://localhost:8089/menu/restaurant/assignRestaurantToChaineRestauration
    @PutMapping("/assignRestaurantToChaineRestauration/{restaurantname}/{chainerestaurationlibelle}")
    @ResponseBody
    public void assignRestaurantToChaineRestauration(@PathVariable("restaurantname") String restaurantname,@PathVariable("chainerestaurationlibelle") String chainerestaurationlibelle){
    restaurantService.affecterRestaurantAChaineRestauration(restaurantname,chainerestaurationlibelle);
    }
}
