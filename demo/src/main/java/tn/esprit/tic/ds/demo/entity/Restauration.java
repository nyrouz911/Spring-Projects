package tn.esprit.tic.ds.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Restauration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idRestaurant;
    public String   nom;
    public  Long    nbPlacesMax;
}
