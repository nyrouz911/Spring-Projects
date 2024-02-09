package tn.esprit.tic.ds.demo.entity;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idMenu;
    public String libelleMenu;
    public TypeMenu typeMenu;
    public Float prixTotal;
    @ManyToMany
    private ArrayList<ChefCuisinier> chefCuisiniers;
    @OneToMany
    private ArrayList<Commande> commandes;
    @OneToMany
    private ArrayList<Composant> composants;
}
