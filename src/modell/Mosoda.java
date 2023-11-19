package modell;

public class Mosoda {

    private enum UzemelesiAllapot {
        UZEMEL, NEM_UZEMEL, LEEGETT
    };
    private UzemelesiAllapot allapot;
    private Auto[] autok;
    private int autoDb;

    public Mosoda() {
        this(1);
    }

    public Mosoda(int db) {
        autoDb = 0;
        autok = new Auto[db];
        allapot = UzemelesiAllapot.LEEGETT;
    }

    public void bevesz(Auto auto) {
        if (autoDb < autok.length) {
            autok[autoDb++] = auto;
        } else {
            System.out.println("A mosoda megtelt!");
        }
    }

    public void uzemel() {
        allapot = UzemelesiAllapot.UZEMEL;
    }
    

    public void nemUzemel() {
       if (allapot == UzemelesiAllapot.NEM_UZEMEL) {
            System.out.println("A mosoda nem üzemel!");
        } else if(allapot == UzemelesiAllapot.LEEGETT){
            System.out.println("A mosoda leégett!");
        }
    }

    public void mos() {
        if (allapot == UzemelesiAllapot.UZEMEL) {
            for (Auto auto : autok) {
                if (auto != null) {
                    if (auto instanceof Motor) {
                        Motor motor = (Motor) auto;
                        motor.setErzekenyseg(motor.getErzekenyseg() * 0.97);
                    }
                    auto.setTiszta(true);
                }
            }
        } else {
            nemUzemel();
        }
    }

    public void kiad(String rendszam) {
        int i = 0;
        while (i < autoDb && autok[i] != null && !(autok[i].getRendszam().equals(rendszam))) {
            i++;
        }
        if (i < autoDb ) {
            String tipus = autok[i] instanceof Auto ? "autója" : "motorja";
            System.out.println("Kiadva %s %s!".formatted(rendszam, tipus));
            autok[i] = null;
        } else {
            System.out.println("Nincs ilyen jármű a mosodában!");
        }
    }

    public String[] getAutok() {
        if (allapot == UzemelesiAllapot.UZEMEL) {
            String[] jarmuvek = new String[this.autok.length];
            for (int i = 0; i < autoDb; i++) {
                Auto a = this.autok[i];
                if (a != null) {
                    jarmuvek[i] = a.toString();
                }
            }
            return jarmuvek;
        } else {
            nemUzemel();
            //return null;
            return new String[]{new NemLetezoJarmu().toString()};
        }
    }
    

}
