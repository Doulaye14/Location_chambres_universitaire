package models;

/**
 * 
 */
public class Loges extends Boursiers {

    /**
     * Default constructor
     */
    public Loges() {
        
    }

    private Chambre chambre;

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

}