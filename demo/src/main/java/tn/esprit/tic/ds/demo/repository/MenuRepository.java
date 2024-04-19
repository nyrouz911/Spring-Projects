package tn.esprit.tic.ds.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.ds.demo.entity.Commande;
import tn.esprit.tic.ds.demo.entity.Menu;
import tn.esprit.tic.ds.demo.entity.TypeComposant;
import tn.esprit.tic.ds.demo.entity.TypeMenu;

import java.util.List;
@Repository
public interface MenuRepository extends CrudRepository<Menu,Long> {
    List<Menu>  findByTypeMenuAndPrixTotalGreaterThan(TypeMenu typeMenu, float prix);

    @Query("SELECT m.libelleMenu FROM Menu m WHERE m.typeMenu = :typeMenu ORDER BY m.prixTotal")
    List<String> findMenuNamesByTypeOrderedByTotalPrice(@Param("typeMenu") TypeMenu typeMenu);

    @Query("SELECT m FROM Menu m JOIN m.composants c JOIN DetailComposant d WHERE d.typeComposant = :typeComposant")
    List<Menu> findMenusByComponentType(@Param("typeComposant") TypeComposant typeComposant);
    Menu findByLibelleMenu(String libelleMenu);

}
