package tn.esprit.tic.ds.demo.entity;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idRestaurant;
    public String   nom;
    public  Long    nbPlacesMax;
    @ManyToOne
    ChaineRestauration chaineRestauration;
    @OneToMany(cascade = CascadeType.ALL)
    List<Menu> menus;
}
