package tn.esprit.tic.ds.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@FieldDefaults(level= AccessLevel.PRIVATE)
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
