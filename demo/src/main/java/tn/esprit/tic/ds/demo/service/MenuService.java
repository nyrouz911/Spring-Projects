package tn.esprit.tic.ds.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.ds.demo.entity.Menu;
import tn.esprit.tic.ds.demo.entity.TypeMenu;
import tn.esprit.tic.ds.demo.repository.MenuRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class MenuService implements IMenuService{
    MenuRepository menuRepository;


    @Override
    public List<Menu> findMenu(TypeMenu typeMenu, float prix) {
        return menuRepository.findByTypeMenuAndPrixTotalGreaterThan(typeMenu,prix);
    }
}
