package tn.esprit.tic.ds.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.ds.demo.repository.CommandeRepository;

@Service
@AllArgsConstructor
public class CommandeService  implements ICommandeService{
    CommandeRepository commandeRepository;
}
