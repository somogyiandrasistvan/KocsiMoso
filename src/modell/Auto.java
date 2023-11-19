
package modell;


public class Auto {
    private String rendszam, marka;
    private boolean tiszta;

    public Auto(String rendszam, String marka) {
        this.rendszam = rendszam;
        this.marka = marka;
        this.tiszta = false;
    }

    public boolean isTiszta() {
        return tiszta;
    }

    public void setTiszta(boolean tiszta) {
        this.tiszta = tiszta;
    }

    public String getRendszam() {
        return rendszam;
        
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Jármű: " + "rendszam=" + rendszam + ", marka=" + marka;
    }
    
    
    
}
