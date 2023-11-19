package modell;

public class Kamion extends Auto {

    private JarmuMeret meret;

    public Kamion(String rendszam, String marka) {
        this(rendszam, marka, JarmuMeret.ATLAGOS);
    }

    public Kamion(String rendszam, String marka, JarmuMeret meret) {
        super(rendszam, marka);
        this.meret = meret;
    }

    public void osszemegy() {

        meret = switch (meret) {
            case KICSI -> JarmuMeret.KICSI;
            case ATLAGOS -> JarmuMeret.ATLAGOS;
            case NAGY -> JarmuMeret.NAGY;
            default -> JarmuMeret.NEMBEVITT;
        };
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + ", típus: Kamion, " + "meret:" + meret ;
    }

    @Override
    public void altalanosMosasHatasa() {
        if (meret.ordinal() > 0) {
            meret = JarmuMeret.values()[meret.ordinal() - 1];
        }
    }
    @Override
    public void kimeloMosasMosasHatasa() {}

}
