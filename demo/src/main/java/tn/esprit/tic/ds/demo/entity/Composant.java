package tn.esprit.tic.ds.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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
