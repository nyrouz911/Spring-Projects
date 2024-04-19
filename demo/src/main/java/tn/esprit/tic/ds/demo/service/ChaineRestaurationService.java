package tn.esprit.tic.ds.demo.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.tic.ds.demo.repository.ChaineRestaurationRepository;

@Service
@AllArgsConstructor
@Slf4j
public class ChaineRestaurationService implements IChaineRestaurationService {
    ChaineRestaurationRepository chaineRestaurationRepository;
}
