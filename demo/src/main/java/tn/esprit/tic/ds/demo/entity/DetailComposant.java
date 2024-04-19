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
@FieldDefaults(level=AccessLevel.PRIVATE)
public class DetailComposant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idDetailComposant;
    public Float    imc;
    @Enumerated(EnumType.STRING)
    public TypeComposant typeComposant;
}
