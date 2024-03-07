package tn.esprit.tic.ds.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.ds.demo.repository.ComposantRepository;

@Service
@AllArgsConstructor
public class ComposantService implements IComposantService {
    ComposantRepository composantRepository;
}
