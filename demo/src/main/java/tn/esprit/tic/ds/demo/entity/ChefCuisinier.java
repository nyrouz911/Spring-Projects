package tn.esprit.tic.ds.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ChefCuisinier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idChefCuisinier;
    public String   nom;
    public String prenom;
    public TypeChef typeChef;
}
