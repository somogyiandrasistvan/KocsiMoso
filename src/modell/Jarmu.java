package modell;

public abstract class Jarmu {

    private String tulNeve;
    private boolean tiszta;

    public Jarmu(String tulNev) {
        this.tulNeve = tulNev;
        tiszta = false;
    }

    public String getTulNev() {
        return tulNeve;
    }

    public void setTulNev(String tulNeve) {
        this.tulNeve = tulNeve;
    }

    public boolean isTiszta() {
        return tiszta;
    }

    public void setTiszta(boolean tiszta) {
        this.tiszta = tiszta;
    }

    @Override
    public String toString() {
        return "Ruha{" + "tulNeve=" + tulNeve + ", tiszta=" + tiszta + '}';
    }

    public abstract void NagyMosas();
    public abstract void KozepesMosas();
    public abstract void KisMosas();

}
