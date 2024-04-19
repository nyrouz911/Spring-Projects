package tn.esprit.tic.ds.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@FieldDefaults(level=AccessLevel.PRIVATE)


public class ChaineRestauration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idChaineRestauration;
    public String   libelle;
    public LocalDate    dateCreation;
    @OneToMany(mappedBy = "chaineRestauration")
    public List<Restaurant> restaurants;

}
