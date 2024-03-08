package tn.esprit.tic.ds.demo.service;

import tn.esprit.tic.ds.demo.entity.ChefCuisinier;

public interface IChefCuisinierService {
    ChefCuisinier affecterChefCuisinierAMenu(Long idChefCuisinier, Long idMenu);
    ChefCuisinier desaffecterChefCuisinierDuMenu(Long idMenu);

}
