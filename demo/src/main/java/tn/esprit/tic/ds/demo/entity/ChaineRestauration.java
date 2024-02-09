package tn.esprit.tic.ds.demo.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.ArrayList;

@Entity
public class ChaineRestauration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idChaineRestauration;
    public String   libelle;
    public LocalDate    dateCreation;
    @OneToMany(mappedBy = "chainerestauration")
    ArrayList<Restauration> restaurants;
}
