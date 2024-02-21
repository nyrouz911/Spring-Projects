package tn.esprit.tic.ds.demo.entity;
import jakarta.persistence.*;
import org.hibernate.cfg.DefaultComponentSafeNamingStrategy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
@Entity
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idClient")
    public Long idClient;
    public String   identifiant;
    @Temporal(TemporalType.DATE)
    public Date DatePremiereVisite;
    @OneToMany(mappedBy = "client")
    private ArrayList<Commande> commandes;
    @OneToMany(mappedBy = "client")
    private ArrayList<Composant> composants;
}
