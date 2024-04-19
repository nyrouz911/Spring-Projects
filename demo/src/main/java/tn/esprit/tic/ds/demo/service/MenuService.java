package tn.esprit.tic.ds.demo.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tic.ds.demo.entity.ChefCuisinier;
import tn.esprit.tic.ds.demo.entity.Composant;
import tn.esprit.tic.ds.demo.entity.Menu;
import tn.esprit.tic.ds.demo.entity.TypeMenu;
import tn.esprit.tic.ds.demo.repository.ChefCuisinierRepository;
import tn.esprit.tic.ds.demo.repository.ComposantRepository;
import tn.esprit.tic.ds.demo.repository.MenuRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
@Slf4j
public class MenuService implements IMenuService{
    MenuRepository menuRepository;
    ChefCuisinierRepository chefCuisinierRepository;
    ComposantRepository composantRepository;


    @Override
    public List<Menu> findMenu(TypeMenu typeMenu, float prix) {
        return menuRepository.findByTypeMenuAndPrixTotalGreaterThan(typeMenu,prix);
    }

    @Override
    public List<String> nomMenuParTypeMenuOrdonneParPrixTotal(TypeMenu typeMenu) {
        return null;
    }

    @Override
    public List<Menu> listeMenuSelonTypeMenuEtprixComposantsSuperieurAUnMontant(TypeMenu typeMenu, Float prixTotal) {
        return null;
    }

    @Override
    public ChefCuisinier affecterChefCuisinierAMenu(Long idChefCuisinier, Long idMenu){
        Menu menu = menuRepository.findById(idMenu).get();
        ChefCuisinier chefCuisinier =  chefCuisinierRepository.findById(idChefCuisinier).get();
        List<Menu> menuMiseàjour = new ArrayList<>();
        if(chefCuisinier.getMenus()!=null){
            menuMiseàjour=chefCuisinier.getMenus();
        }
        menuMiseàjour.add(menu);
        chefCuisinier.setMenus(menuMiseàjour);
        chefCuisinierRepository.save(chefCuisinier);
        return  chefCuisinier;
    }
    @Override
    public void desaffecterChefCuisinierDuMenu(Long idMenu, Long idChef) {
        Menu menu = menuRepository.findById(idMenu).orElse(null);
        if (menu == null) {
            return;
        }
        ChefCuisinier chefCuisinier = chefCuisinierRepository.findById(idChef).orElse(null);
        if (chefCuisinier == null) {
            return;
        }
        chefCuisinier.getMenus().remove(menu);
        chefCuisinierRepository.save(chefCuisinier);
    }
    @Override
    public Menu ajoutComposantsEtMiseAjourPrixMenu(Set<Composant> composants, Long idMenu) {
        Menu menu=menuRepository.findById(idMenu).orElse(null);

        float prixtotal = 0;
        if (menu == null){
            return null;
        }
        for (Composant c : composants){
            c.setMenu(menu);
            prixtotal+=c.getPrix();
        }
        if(prixtotal+ menu.getPrixTotal()<=20)
        {
            composantRepository.saveAll(composants);
            menu.setPrixTotal(prixtotal);
            menuRepository.save(menu);
        }
        return menu;
    }

}
