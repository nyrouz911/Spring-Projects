package tn.esprit.tic.ds.demo.service;

import tn.esprit.tic.ds.demo.entity.Client;
import tn.esprit.tic.ds.demo.repository.ClientRepository;

import java.util.List;

public class ClientService implements IClientService{
    ClientRepository clientRepository;

    @Override
    public List<Client> retrieveAllClients() {
        return (List<Client>) clientRepository.findAll();
    }

    @Override
    public Client addClient(Client e) {
        return clientRepository.save(e);
    }

    @Override
    public Client updateClient(Client e) {
        return clientRepository.save(e);
    }

    @Override
    public Client retrieveClient(Long idClient) {
        return clientRepository.findById(idClient).orElse(null);
    }

    @Override
    public void removeClient(Long idClient) {
         clientRepository.deleteById(idClient);
    }

    @Override
    public List<Client> addClients(List<Client> clients) {
        return (List<Client>) clientRepository.saveAll(clients);
        }
}
