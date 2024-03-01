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

    public Long getIdClient() {
        return idClient;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public Date getDatePremiereVisite() {
        return DatePremiereVisite;
    }

    public ArrayList<Commande> getCommandes() {
        return commandes;
    }

    public ArrayList<Composant> getComposants() {
        return composants;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public void setDatePremiereVisite(Date datePremiereVisite) {
        DatePremiereVisite = datePremiereVisite;
    }

    public void setCommandes(ArrayList<Commande> commandes) {
        this.commandes = commandes;
    }

    public void setComposants(ArrayList<Composant> composants) {
        this.composants = composants;
    }
}
