package tn.esprit.tic.ds.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChaineRestauration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idChaineRestauration;
    public String   libelle;
    public LocalDate    dateCreation;
    @OneToMany(mappedBy = "chaineRestauration")
    public List<Restaurant> restaurants;

}
