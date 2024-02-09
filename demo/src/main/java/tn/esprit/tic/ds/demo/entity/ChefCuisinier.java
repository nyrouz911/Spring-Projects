package tn.esprit.tic.ds.demo.entity;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class ChefCuisinier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idChefCuisinier;
    public String   nom;
    public String prenom;
    public TypeChef typeChef;
    @ManyToMany
    private ArrayList<Menu> menus;
}
