package tn.esprit.tic.ds.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DetailComposant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idDetailComposant;
    public Float    imc;
    public TypeComposant typeComposant;
}
