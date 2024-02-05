package tn.esprit.tic.ds.demo.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idClient")
    public Long idClient;
    public String   identifiant;
    @Temporal(TemporalType.DATE)
    public Date DatePremiereVisite;

}
