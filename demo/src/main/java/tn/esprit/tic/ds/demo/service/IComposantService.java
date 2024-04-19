package tn.esprit.tic.ds.demo.service;

import tn.esprit.tic.ds.demo.entity.Commande;
import tn.esprit.tic.ds.demo.entity.Composant;
import tn.esprit.tic.ds.demo.entity.Menu;

import java.util.List;

public interface IComposantService {
    List<Composant> retrieveAllComposants();

    Composant addComposant(Composant e);

    Composant updateComposant(Composant e);

    Composant retrieveComposant(Long idComposant);

    void removeComposant(Long idComposant);

    List<Composant> addComposants(List<Composant> Composants);
    Menu ajoutComposantsEtMiseAjourPrixMenu(List<Composant> composants, Long idMenu);

}
