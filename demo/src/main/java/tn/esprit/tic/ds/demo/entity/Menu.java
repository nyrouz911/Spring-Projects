package tn.esprit.tic.ds.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
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
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idMenu;
    public String libelleMenu;
    @Enumerated(EnumType.STRING)
    public TypeMenu typeMenu;
    public Float prixTotal;
    @ManyToMany(mappedBy = "menus")
    private List<ChefCuisinier> chefCuisiniers;
    @OneToMany(mappedBy = "menus")
    private List<Commande> commandes;
    @OneToMany(mappedBy = "menu")
    private List<Composant> composants;
}
