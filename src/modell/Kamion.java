package modell;

public class Kamion extends Jarmu {

    private double szinIntenzitas;

    public Kamion(String tulNev) {
        super(tulNev);
        szinIntenzitas = 100;
    }

    public double getSzin() {
        return szinIntenzitas;
    }

    public void setSzin(double szinIntenzitas) {
        this.szinIntenzitas = szinIntenzitas;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + System.lineSeparator() + "\t"
                + "Kamion{" + "szinIntenzitas=" + szinIntenzitas + '}';
    }

    @Override
    public void nagyMosas() {
        szinIntenzitas *= .97;
    }

    @Override
    public void kozepesMosas() {
        szinIntenzitas *= .97;
    }

    @Override
    public void kisMosas() {
        szinIntenzitas *= .985;
    }

}
