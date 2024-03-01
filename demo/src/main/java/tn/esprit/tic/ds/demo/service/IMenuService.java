package tn.esprit.tic.ds.demo.service;

import tn.esprit.tic.ds.demo.entity.Menu;
import tn.esprit.tic.ds.demo.entity.TypeMenu;

import java.util.List;

public interface IMenuService {
    public List<Menu> findMenu(TypeMenu typeMenu, float prix);
}
