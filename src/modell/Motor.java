package modell;

public class Motor extends Jarmu {

    private double allapot;

    public Motor(String tulNev) {
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
                + "Motor{" + "állapot=" + allapot + '}';
    }

    @Override
    public void nagyMosas() {
        allapot *= .98;
    }

    @Override
    public void kozepesMosas() {
        allapot *= .99;
    }

    @Override
    public void kisMosas() {
    }

}
