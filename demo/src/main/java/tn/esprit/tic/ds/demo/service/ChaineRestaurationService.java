package tn.esprit.tic.ds.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.ds.demo.repository.ChaineRestaurationRepository;

@Service
@AllArgsConstructor
public class ChaineRestaurationService implements IChaineRestaurationService {
    ChaineRestaurationRepository chaineRestaurationRepository;
}
