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
        allapot = UzemelesiAllapot.UZEMEL;
    }

    public void altalanosMosas() {
        if (allapot == UzemelesiAllapot.UZEMEL) {
            for (Auto auto : autok) {
                if (auto != null) {
                    auto.setTiszta(true);
                    auto.altalanosMosasHatasa();
                }
            }
        } else {
            nemUzemel();
        }
    }

    public void kimeloMosas() {
        if (allapot == UzemelesiAllapot.UZEMEL) {
            for (Auto auto : autok) {
                if (auto != null) {
                    auto.setTiszta(true);
                    auto.kimeloMosasMosasHatasa();
                }
            }
        } else {
            nemUzemel();
        }
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
        } else if (allapot == UzemelesiAllapot.LEEGETT) {
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

    public Auto kiad(String rendszam, String marka) {
        Auto a = new NemLetezoJarmu();
        if (allapot == UzemelesiAllapot.UZEMEL) {
            int i = 0;
            while (autok[i] == null || i < autoDb && !(autok[i].getMarka().equals(marka)) && !(autok[i].getRendszam().equals(rendszam))) {
                i++;
            }
            if (i < autoDb) {
                String tipus = autok[i] instanceof Auto ? "Kamion" : "Motorja";
                System.out.println("Kiadva %s %s!".formatted(rendszam,marka, tipus));
                a = autok[i];
                autok[i] = null;//ez is lehetne NemletezoRuha
            } else {
                System.out.println("Nincs ilyen jármű a mosodában!");
            }

        } else {
            nemUzemel();
        }

        return a;
    }

    public Auto[] getAutok() {
        if (allapot == UzemelesiAllapot.UZEMEL) {
            Auto[] kiadottAutok = new Auto[this.autok.length];
            for (int i = 0; i < autoDb; i++) {
                Auto aktualisAuto = this.autok[i];
                if (aktualisAuto != null) {
                    kiadottAutok[i] = aktualisAuto;
                }
            }
            return kiadottAutok;
        } else {
            nemUzemel();
            return new Auto[0];
        }
    }

}
