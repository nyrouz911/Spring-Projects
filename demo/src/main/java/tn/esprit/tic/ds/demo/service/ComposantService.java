package tn.esprit.tic.ds.demo.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.tic.ds.demo.entity.Commande;
import tn.esprit.tic.ds.demo.entity.Composant;
import tn.esprit.tic.ds.demo.entity.Menu;
import tn.esprit.tic.ds.demo.repository.ComposantRepository;
import tn.esprit.tic.ds.demo.repository.MenuRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ComposantService implements IComposantService {


    ComposantRepository composantRepository;
    MenuRepository menuRepository;

    @Override
    public List<Composant> retrieveAllComposants() {
        return (List<Composant>) composantRepository.findAll();
    }

    @Override
    public Composant addComposant(Composant e) {
        return composantRepository.save(e);
    }

    @Override
    public Composant updateComposant(Composant e) {
        return composantRepository.save(e);
    }

    @Override
    public Composant retrieveComposant(Long idComposant) {
        return composantRepository.findById(idComposant).orElse(null);
    }

    @Override
    public void removeComposant(Long idComposant) {
        composantRepository.deleteById(idComposant);
    }

    @Override
    public List<Composant> addComposants(List<Composant> Composants) {
        return (List<Composant>) composantRepository.saveAll(Composants);
    }

    @Override
    public Menu ajoutComposantsEtMiseAjourPrixMenu(List<Composant> composants, Long idMenu) {
        //Ajouter Composant
        //Affecter Composant Menu
        //Mise à jour Prix Menu
        //Etapes à suivre pour faire la fct
        Float prixtotal = Float.valueOf(0);
        Menu menu = menuRepository.findById(idMenu).orElse(null);
        for (Composant composant : composants) {
            composant.setMenu(menu);
            prixtotal+=composant.getPrix();
        }
        if(prixtotal<=Float.valueOf(20))
        {
            composantRepository.saveAll(composants);
            menu.setPrixTotal(prixtotal);
            menuRepository.save(menu);
        }
        return menuRepository.findById(idMenu).get();
    }
}
