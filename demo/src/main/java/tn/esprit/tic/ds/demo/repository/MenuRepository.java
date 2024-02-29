package tn.esprit.tic.ds.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit.tic.ds.demo.entity.Commande;
import tn.esprit.tic.ds.demo.entity.Menu;
import tn.esprit.tic.ds.demo.entity.TypeComposant;
import tn.esprit.tic.ds.demo.entity.TypeMenu;

import java.util.List;

public interface MenuRepository extends CrudRepository<Menu,Long> {
    List<Menu>  FindByTypeMenuAndPrixTotalGreaterThan(Float prix);

    @Query("SELECT m.libelleMenu FROM Menu m WHERE m.typeMenu = :typeMenu ORDER BY m.prixTotal")
    List<String> findMenuNamesByTypeOrderedByTotalPrice(@Param("typeMenu") TypeMenu typeMenu);

    @Query("SELECT m FROM Menu m JOIN m.composants c WHERE c.typeComposant = :typeComposant")
    List<Menu> findMenusByComponentType(@Param("typeComposant") TypeComposant typeComposant);
}
