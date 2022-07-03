package services;

import java.util.Scanner;

import models.Chambre;
import models.Etudiant;
import models.Loges;
import models.Pavillon;
import models.TypeChambre;


public class ServiceTableau implements IService {

    Scanner sc = new Scanner(System.in);

    TypeChambre indiv = TypeChambre.INDIVIDUEL;
    TypeChambre collect = TypeChambre.COLLECTIF;

    ServicePavillon svPav = new ServicePavillon();

    private final int TAILLE = 10;

    private int indexPav;
    private int indexCh;

    private Pavillon[] pavillons= new Pavillon[TAILLE];
    private Chambre[] chambres = new Chambre[TAILLE];    

    int idCh = 1;
    
    @Override
    public void addPavillon(Pavillon pavillon) {
        System.out.println("=== Ajouter un Pavillon ===");
        if(indexPav < TAILLE){
            pavillons[indexPav] = svPav.creerPavillon(pavillon, (indexPav+1));
            indexPav++;
        }else{
            System.out.println("le tableau est plein");
        }
        
    }

    @Override
    public void listerPavillon() {
        if (pavillons.length != 0) {
            for (Pavillon p : pavillons) {
                if(p!=null){
                    System.out.println(p);
                }
            }
        } else {
            System.out.println("Il n'y a pas de pavillons");
        }
        
        
    }

    @Override
    public void supprimerPavillon(Pavillon pavillon) {
                
    }

    @Override
    public void addChambre(Chambre chambre) {
        
        System.out.println("=== Ajouter Chambre === ");

        if (indexCh < TAILLE) {
            chambre.setId(idCh);

            System.out.print(" === Numero chambre : ");
            int numCh = sc.nextInt();
            chambre.setNumeroChambre(numCh);

            System.out.print(" === Etage n° : ");
            int numEtg = sc.nextInt();
            chambre.setNumeroEtage(numEtg);

            System.out.println(" === Type de chambre : ");
            System.out.println("##-1 Chambre "+ indiv +" ##-2 Chambre "+ collect);
            int type = sc.nextInt();

            if(type == 1){
                chambre.setTypeChambre(indiv);
            }else if(type == 2){
                chambre.setTypeChambre(collect);
            }else{
                System.exit(0);
            }

            System.out.println("Dans quel pavillon se trouve cette chambre ?");
                listerPavillon();
            System.out.println("Tapez un id du pavillon");

            int pav = sc.nextInt();

            if(pavillons[(pav-1)] != null){
                chambre.setPavillon(pavillons[(pav-1)]);
            }else{
                System.out.println("Ce pavillon n'existe pas !");
            }
            chambres[indexCh] = chambre;
            idCh++;
            indexCh++;
        } else {
            System.out.println("Le tableau est plein");
        }
    }

    @Override
    public void listerChambreDunPavillon(Pavillon pavillon) {
                
    }

    @Override
    public void listerChambre() {
        if (chambres.length != 0) {
            for (Chambre chambre : chambres) {
                if (chambre != null) {
                    System.out.println(chambre);
                }
            } 
        } else {
            System.out.println("Il n'y apas de chambres");
        }
        
    }

    @Override
    public void archiverChambre(Chambre chambre) {
                
    }

    @Override
    public void addEtudiant(Etudiant etudiant) {
                
    }

    @Override
    public void listerEtudiantChambre(Chambre chambre) {
                
    }

    @Override
    public void affecterChambrePavillon(Chambre chambre, Pavillon pavillon) {
        
    }


    @Override
    public void affecterChambreBoursierLoge(Chambre chambre, Loges BoursiersLoges) {
                
    }
   
}
