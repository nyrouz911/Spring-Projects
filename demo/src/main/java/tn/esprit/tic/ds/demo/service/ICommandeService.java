package tn.esprit.tic.ds.demo.service;

import tn.esprit.tic.ds.demo.entity.Commande;

import java.util.List;

public interface ICommandeService {
    List<Commande> retrieveAllCommandes();

    Commande addCommande(Commande e);

    Commande updateCommande(Commande e);

    Commande retrieveCommande(Long idCommande);

    void removeCommande(Long idCommande);

    List<Commande> addCommandes(List<Commande> Commandes);
    List<Commande> listeCommandesParClient(Long idClient);
    void ajouterCommandeEtaffecterAClientEtMenu(Commande commande, String identifiant, String libelleMenu);
    void findCurrentYearCommandesOrderByNote();
    void menuPlusCommande();
}
