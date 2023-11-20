package modell;

public class Kocsi extends Jarmu {

    private double allapot;

    public Kocsi(String tulNev) {
        super(tulNev);
        allapot = 100;
    }

    public double getAllapot() {
        return allapot;
    }

    public void setAllapot(double szinIntenzitas) {
        this.allapot = szinIntenzitas;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + System.lineSeparator() + "\t"
                + "Kocsi{" + "állapot=" + allapot + '}';
    }

    @Override
    public void nagyMosas() {
        allapot *= .99;
    }

    @Override
    public void kozepesMosas() {
    }

    @Override
    public void kisMosas() {
    }

}
