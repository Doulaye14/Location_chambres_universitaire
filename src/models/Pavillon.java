package models;

/**
 * 
 */
public class Pavillon {

    /**
     * Default constructor
     */
    public Pavillon() {
    }

    public int id;

    public int nombreEtages;

    public int numeroPavillon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNombreEtages() {
        return nombreEtages;
    }

    public void setNombreEtages(int nombreEtages) {
        this.nombreEtages = nombreEtages;
    }

    public int getNumeroPavillon() {
        return numeroPavillon;
    }

    public void setNumeroPavillon(int numeroPavillon) {
        this.numeroPavillon = numeroPavillon;
    }

    @Override
    public String toString() {
        return "Pavillon [id=" + id + ", Pavillon n°= " + numeroPavillon + ", Nombre d'étages = " + nombreEtages + "]";
    }

}