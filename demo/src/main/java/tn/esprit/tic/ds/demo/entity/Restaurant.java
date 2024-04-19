package tn.esprit.tic.ds.demo.entity;
import java.util.ArrayList;
import java.util.List;

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
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idRestaurant;
    public String   nom;
    public  Long    nbPlacesMax;
    @ManyToOne
    ChaineRestauration chaineRestauration;
    @OneToMany(cascade = CascadeType.ALL)
    List<Menu> menus;
}
