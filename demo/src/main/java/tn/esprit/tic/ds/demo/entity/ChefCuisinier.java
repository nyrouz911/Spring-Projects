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
@Builder
@FieldDefaults(level=AccessLevel.PRIVATE)
public class ChefCuisinier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idChefCuisinier;
    public String   nom;
    public String prenom;
    @Enumerated(EnumType.STRING)
    public TypeChef typeChef;
    @ManyToMany
    private List<Menu> menus;
}
