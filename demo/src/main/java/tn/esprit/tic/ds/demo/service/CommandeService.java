package tn.esprit.tic.ds.demo.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tic.ds.demo.entity.Client;
import tn.esprit.tic.ds.demo.entity.Commande;
import tn.esprit.tic.ds.demo.entity.Menu;
import tn.esprit.tic.ds.demo.repository.ClientRepository;
import tn.esprit.tic.ds.demo.repository.CommandeRepository;
import tn.esprit.tic.ds.demo.repository.MenuRepository;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class CommandeService  implements ICommandeService{
    CommandeRepository commandeRepository;
    MenuRepository menuRepository;
    ClientRepository clientRepository;

    @Override
    public List<Commande> retrieveAllCommandes() {
        return (List<Commande>) commandeRepository.findAll();
    }

    @Override
    public Commande addCommande(Commande e) {
        return commandeRepository.save(e);
    }

    @Override
    public Commande updateCommande(Commande e) {
        return commandeRepository.save(e);
    }

    @Override
    public Commande retrieveCommande(Long idCommande) {
        return commandeRepository.findById(idCommande).orElse(null);
    }

    @Override
    public void removeCommande(Long idCommande) {
        commandeRepository.deleteById(idCommande);
    }

    @Override
    public List<Commande> addCommandes(List<Commande> Commandes) {
        return (List<Commande>) commandeRepository.saveAll(Commandes);
    }

    @Override
    public List<Commande> listeCommandesParClient(Long idClient) {
        List<Commande> commandes = commandeRepository.findByClientIdClient(idClient);
        return commandes;
    }

    @Override
    public void ajouterCommandeEtaffecterAClientEtMenu(Commande commande, String identifiant, String libelleMenu) {
        //Ajouter Commande
        //Affecter Commande Client
        //Affecter Commande Menu
        //Total Commande
        //Total Remise
        //Etapes à suivre pour faire la fct
        Menu menu = menuRepository.findByLibelleMenu(libelleMenu);
        Client client = clientRepository.findByIdentifiant(identifiant);
        commande.setClient(client);
        commande.setMenus(menu);
        commande.setTotalRemise((menu.getPrixTotal()*commande.getPourcentageRemise())/100);
        commande.setTotalCommande(menu.getPrixTotal()-commande.getTotalRemise());
        commandeRepository.save(commande);

    }

    @Override
    @Scheduled(cron="*/10 * * * * *")
    public void findCurrentYearCommandesOrderByNote() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        List<Commande> commandes = commandeRepository.findByDateCommandeYearOrderByNoteDesc(currentYear);

        for(Commande commande : commandes){
            System.out.println("La commande faite le "+commande.dateCommande+" d'un montant global de "+commande.totalCommande+" a une note de "+commande.note);
        }
    }
}
