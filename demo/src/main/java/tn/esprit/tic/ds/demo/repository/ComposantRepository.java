package tn.esprit.tic.ds.demo.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.tic.ds.demo.entity.Composant;

public interface ComposantRepository extends CrudRepository<Composant,Long> {
}
