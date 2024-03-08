package tn.esprit.tic.ds.demo.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.tic.ds.demo.entity.ChaineRestauration;
import tn.esprit.tic.ds.demo.entity.Restaurant;

import java.util.List;

public interface ChaineRestaurationRepository extends CrudRepository<ChaineRestauration,Long> {
    ChaineRestauration  findByLibelle(String libelle);

}
