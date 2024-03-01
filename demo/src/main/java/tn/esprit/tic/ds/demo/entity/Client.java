package tn.esprit.tic.ds.demo.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.cfg.DefaultComponentSafeNamingStrategy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    private List<Commande> commandes;
    @OneToMany(mappedBy = "client")
    private List<Composant> composants;

    //getters and setters

    public Long getIdClient() {
        return idClient;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public Date getDatePremiereVisite() {
        return DatePremiereVisite;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public List<Composant> getComposants() {
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

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    public void setComposants(List<Composant> composants) {
        this.composants = composants;
    }
}
