
package modell;


public class Kocsi extends Auto {
    
    private double tisztasag;
    public Kocsi(String rendszam, String marka) {
        super(rendszam, marka);
        tisztasag = 100;
    }

    public double getTisztasag() {
        return tisztasag;
    }

    public void setTisztasag(double tisztasag) {
        this.tisztasag = tisztasag;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + "Kocsi{" + "tisztasag=" + tisztasag + '}';
    }
    
    
    
}
