package modell;

public class Kamion extends Jarmu {

    private JarmuMeret meret;

    public Kamion(String tulNev) {
        this(tulNev, JarmuMeret.KOZEPES);
    }

    public Kamion(String tulNev, JarmuMeret meret) {
        super(tulNev);
        this.meret = meret;
    }
    
    public void osszemegy(){
        meret = switch (meret) {
            case TUL_NAGY -> JarmuMeret.KOZEPES;
            case KOZEPES -> JarmuMeret.KICSI;
            default -> JarmuMeret.KICSI;
        };
    }
    
    @Override
    public String toString() {
        String os = super.toString();
        return os + System.lineSeparator() + "\t"
                + "Kamion{" + "meret=" + meret + '}';
    }
    
    @Override
    public void nagyMosas() {
    }

    @Override
    public void kozepesMosas() {
    }

    @Override
    public void kisMosas() {
    }

}
