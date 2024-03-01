package tn.esprit.tic.ds.demo.service;

import tn.esprit.tic.ds.demo.entity.Client;

import java.util.List;

public interface IClientService {
    List<Client> retrieveAllClients();
    Client addClient(Client e);
    Client updateClient(Client e);
    Client retrieveClient(Long idClient);
    void deleteClient(Long idClient);
    List<Client> addClients(List<Client> clients);
}
