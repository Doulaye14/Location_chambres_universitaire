package models;

/**
 * 
 */
public class Boursiers extends Etudiant {

    /**
     * Default constructor
     */
    public Boursiers() {
    }
    
    protected float montantBourse;

    protected TypeBourse typeBourse;

    public TypeBourse getTypeBourse() {
        return typeBourse;
    }

    public void setTypeBourse(TypeBourse typeBourse) {
        this.typeBourse = typeBourse;
    }

    public float getMontantBourse() {
        return montantBourse;
    }

    public void setMontantBourse(float montantBourse) {
        this.montantBourse = montantBourse;
    }

}