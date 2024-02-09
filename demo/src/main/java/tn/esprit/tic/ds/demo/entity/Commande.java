package tn.esprit.tic.ds.demo.entity;
import java.util.ArrayList;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.time.LocalDate;
@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idCommande;
    @Temporal(TemporalType.DATE)
    public LocalDate dateCommande;
    public Integer  pourcentageRemise;
    public Float    totalRemise;
    public Float    totalCommande;
    public Long     note;
    @ManyToOne
    private Client clients;
    @ManyToOne
    private Menu menus;

}
