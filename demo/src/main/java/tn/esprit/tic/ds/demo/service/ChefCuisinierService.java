package tn.esprit.tic.ds.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.ds.demo.repository.ChefCuisinierRepository;

@Service
@AllArgsConstructor
public class ChefCuisinierService implements IChefCuisinierService {
    ChefCuisinierRepository chefCuisinierRepository;
}
