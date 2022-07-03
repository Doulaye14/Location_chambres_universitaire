package models;

/**
 * 
 */
public class Personne {

    /**
     * Default constructor
     */
    public Personne() {
    }

    protected int id;

    protected String nomComplet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

}