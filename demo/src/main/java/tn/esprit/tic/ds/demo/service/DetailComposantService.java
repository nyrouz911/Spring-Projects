package tn.esprit.tic.ds.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.ds.demo.repository.DetailComposantRepository;

@Service
@AllArgsConstructor
public class DetailComposantService implements IDetailComposantService {
    DetailComposantRepository detailComposantRepository;
}
