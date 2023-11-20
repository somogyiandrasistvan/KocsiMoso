package modell;

public class Kamion extends Jarmu {

    private double magassag;
    private double szelesseg;

    public Kamion(String rendszám, String márka, double magassag, double szelesseg) {
        super(rendszám, márka);
        this.magassag = magassag;
        this.szelesseg = szelesseg;
    }

    public double getMagassag() {
        return magassag;
    }

    public double getSzelesseg() {
        return szelesseg;
    }

    @Override
    public void gyengebbMosas() {
        ellenorzes();
    }

    @Override
    public void normalMosas() {
        ellenorzes();

    }

    public void ellenorzes() {
        if (magassag > 2.4 || szelesseg > 2.2) {
            setTiszta(false);
            System.out.println("Tul nagy a jármű");
        }
    }
}
