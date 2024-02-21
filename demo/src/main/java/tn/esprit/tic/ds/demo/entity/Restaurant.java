package tn.esprit.tic.ds.demo.entity;
import java.util.ArrayList;
import jakarta.persistence.*;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idRestaurant;
    public String   nom;
    public  Long    nbPlacesMax;
    @ManyToOne
    ChaineRestauration chaineRestauration;
    @OneToMany
    ArrayList<Menu> menus;
}
