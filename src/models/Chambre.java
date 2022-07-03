package models;
/**
 * 
 */
public class Chambre {

    /**
     * Default constructor
     */
    public Chambre() {
    }

    private int id;

    private int numeroChambre;

    private int numeroEtage;

    // Attributs navigationnels
    private Pavillon pavillon;
    private TypeChambre typeChambre;

    public Pavillon getPavillon() {
        return pavillon;
    }

    public void setPavillon(Pavillon pavillon) {
        this.pavillon = pavillon;
    }

    public TypeChambre getTypeChambre() {
        return typeChambre;
    }

    public void setTypeChambre(TypeChambre typeChambre) {
        this.typeChambre = typeChambre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public int getNumeroEtage() {
        return numeroEtage;
    }

    public void setNumeroEtage(int numeroEtage) {
        this.numeroEtage = numeroEtage;
    }

    @Override
    public String toString() {
        return "Chambre [id=" + id + ", numeroChambre=" + numeroChambre + ", numeroEtage=" + numeroEtage + ", pavillon n°="
                + pavillon.getId() + ", typeChambre=" + typeChambre + "]";
    }

}