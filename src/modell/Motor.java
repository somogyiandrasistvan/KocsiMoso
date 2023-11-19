
package modell;


public class Motor extends Auto {
    
    private double erzekenysege;
    public Motor(String rendszam, String marka) {
        super(rendszam, marka);
        erzekenysege = 100;
    }

    public double getErzekenyseg() {
        return erzekenysege;
    }

    public void setErzekenyseg(double tisztasag) {
        this.erzekenysege = tisztasag;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + "Kocsi{" + "tisztasag=" + erzekenysege + '}';
    }
    
    
    
}
