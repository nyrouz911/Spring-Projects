package tn.esprit.tic.ds.demo.service;

import tn.esprit.tic.ds.demo.entity.ChefCuisinier;
import tn.esprit.tic.ds.demo.entity.Composant;
import tn.esprit.tic.ds.demo.entity.Menu;
import tn.esprit.tic.ds.demo.entity.TypeMenu;

import java.util.List;
import java.util.Set;

public interface IMenuService {
    public List<Menu> findMenu(TypeMenu typeMenu, float prix);
    List<String> nomMenuParTypeMenuOrdonneParPrixTotal(TypeMenu typeMenu);
    ChefCuisinier affecterChefCuisinierAMenu(Long idChefCuisinier, Long idMenu);
    void desaffecterChefCuisinierDuMenu(Long idMenu, Long idChef);
    List<Menu>  listeMenuSelonTypeMenuEtprixComposantsSuperieurAUnMontant(TypeMenu typeMenu, Float prixTotal);
    Menu ajoutComposantsEtMiseAjourPrixMenu(Set<Composant> composants, Long idMenu);
}
