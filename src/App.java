import java.util.Scanner;

import models.Chambre;
import models.Pavillon;
import services.ServiceTableau;

public class App {

    static Scanner sc = new Scanner(System.in);
    static ServiceTableau serviceTab = new ServiceTableau();

    /**
     * Permet d'ajouter et ou de lister des pavillons
     */
    public static void executPavillons(){
        
        System.out.println("##-1 : Ajouter Pavillon  ===  ##-2 : Voire liste Pavillons ");

        int resp = sc.nextInt();

        if (resp == 1) {
            serviceTab.addPavillon(new Pavillon());
            System.out.println("Voulez-vous ajouter à nouveau ?");
            System.out.println("##-1 : Oui  ===  ##-2 : Non");
            
            resp = sc.nextInt();

            if (resp == 1) {
                executPavillons();
            } else {
                System.out.println("=======================");
                serviceTab.listerPavillon();
                System.out.println("=======================");
            }

        }else if(resp == 2){
            System.out.println("=======================");
            serviceTab.listerPavillon();
            System.out.println("=======================");
        }else{
            System.exit(0);
        }
    }

    /**
     * Permet d'ajouter et ou de lister des chambres
     */
    public static void executChambre(){
        System.out.println("##-1 : Ajouter Chambre  ===  ##-2 : Lister Chambres");
        int rep = sc.nextInt();

        if (rep == 1) {
            serviceTab.addChambre(new Chambre());
            System.out.println("Voulez-vous ajouter à nouveau ?");
            System.out.println("##-1 : Oui  ===  ##-2 : Non");

            int resp = sc.nextInt();
            if (resp == 1) {
                executChambre();
            } else {
                System.out.println("=========================");
                serviceTab.listerChambre();
                System.out.println("=========================");
            }
        } else if(rep == 2) {
            System.out.println("=========================");
            serviceTab.listerChambre();
            System.out.println("=========================");
        }else{
            System.exit(0);
        }
    }
    
    public static void executApp(){
        System.out.println("Que souhaitez-vous faire ?");
        System.out.println("##-1 : Ajoueter et/ou Lister des pavillons");
        System.out.println("##-2 : Ajoueter et/ou Lister des chambres");
        System.out.println("##-0 : Pour quitter");

        int resp = sc.nextInt();

        switch (resp) {
            case 1:
                executPavillons();
                break;
            case 2:
                executChambre();
                break;
            case 0:
                System.out.println("Merci d'avoir quitter !");
                System.exit(0);
                break;
            default:
                executApp();
                break;
        }
        executApp();
    }
    public static void main(String[] args) {
        executApp();
    }
}
