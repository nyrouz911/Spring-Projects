package tn.esprit.tic.ds.demo.entity;

import jakarta.persistence.*;

@Entity
public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idComposant;
    public String nomComposant;
    public Float prix;
    @ManyToOne
    Menu menu;
    @OneToOne
    Client client;

}
