package tn.esprit.tic.ds.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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
