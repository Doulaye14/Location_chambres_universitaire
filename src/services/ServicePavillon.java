package services;

import java.util.Scanner;
import models.Pavillon;

public class ServicePavillon {
    Scanner sc = new Scanner(System.in);
    Pavillon pavillon = new Pavillon();

    public Pavillon creerPavillon(Pavillon pavillon, int id){

        pavillon.setId(id);

        System.out.print("Numero du pavillon : ");
        int numPav = sc.nextInt();
        pavillon.setNumeroPavillon(numPav);

        System.out.print("Nombre d'étages du pavillon : ");
        int nbreDetages = sc.nextInt();
        pavillon.setNombreEtages(nbreDetages);

        return pavillon;

    }
}
