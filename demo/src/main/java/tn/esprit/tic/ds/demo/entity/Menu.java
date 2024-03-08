package tn.esprit.tic.ds.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idMenu;
    public String libelleMenu;
    public TypeMenu typeMenu;
    public Float prixTotal;
    @ManyToMany(mappedBy = "menus")
    private List<ChefCuisinier> chefCuisiniers;
    @OneToMany(mappedBy = "menus")
    private List<Commande> commandes;
    @OneToMany(mappedBy = "menu")
    private List<Composant> composants;
}
