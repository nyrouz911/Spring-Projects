package tn.esprit.tic.ds.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.ds.demo.entity.ChefCuisinier;
import tn.esprit.tic.ds.demo.repository.ChefCuisinierRepository;

@Service
@AllArgsConstructor
public class ChefCuisinierService implements IChefCuisinierService {
    ChefCuisinierRepository chefCuisinierRepository;

    @Override
    public ChefCuisinier affecterChefCuisinierAMenu(Long idChefCuisinier, Long idMenu) {
        return null;
    }

    @Override
    public ChefCuisinier desaffecterChefCuisinierDuMenu(Long idMenu) {
        return null;
    }

}
