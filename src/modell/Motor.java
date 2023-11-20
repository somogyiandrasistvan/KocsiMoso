package modell;

public class Motor extends Jarmu {

    private double allapot;

    public Motor(String rendszám, String márka) {
        super(rendszám, márka);
        this.allapot = 100;
    }

    public double getAllapot() {
        return allapot;
    }

    public void setAllapot(double allapot) {
        this.allapot = allapot;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + System.lineSeparator() + "\t"
                + "Motor{" + "allapot=" + allapot + '}';
    }

    @Override
    public void gyengebbMosas() {
    }

    @Override
    public void normalMosas() {
        allapot *= .97;
    }

}
