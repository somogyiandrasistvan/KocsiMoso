
package modell;

public class Auto {
    private String rendszám;
    private String márka;
    private boolean tiszta;

    public Auto(String rendszám, String márka) {
        this.rendszám = rendszám;
        this.márka = márka;
        tiszta = false;
    }

    public String getRendszám() {
        return rendszám;
    }

    public String getMárka() {
        return márka;
    }

    public void setRendszám(String rendszám) {
        this.rendszám = rendszám;
    }

    public void setMárka(String márka) {
        this.márka = márka;
    }

    public boolean isTiszta() {
        return tiszta;
    }

    public void setTiszta(boolean tiszta) {
        this.tiszta = tiszta;
    }

    @Override
    public String toString() {
        return "Auto{" + "rendsz\u00e1m=" + rendszám + ", m\u00e1rka=" + márka + ", tiszta=" + tiszta + '}';
    }


    
    
    
}
