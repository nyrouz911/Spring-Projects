package tn.esprit.tic.ds.demo.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.tic.ds.demo.entity.Client;

public interface ClientRepository extends CrudRepository <Client,Long> {
}
