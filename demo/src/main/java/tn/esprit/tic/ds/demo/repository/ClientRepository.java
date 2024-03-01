package tn.esprit.tic.ds.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.ds.demo.entity.Client;
@Repository
public interface ClientRepository extends CrudRepository <Client,Long> {

}
