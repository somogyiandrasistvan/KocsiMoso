package modell;

import static modell.JarmuMeret.NAGY;
import static modell.JarmuMeret.KOZEPES;
import static modell.JarmuMeret.KICSI;

public class Kocsimoso {

    private Jarmu[] ruhak;
    private int ruhaDb;

    private enum UzemelesiAllapot {
        UZEMEL, NEM_UZEMEL, LEEGETT
    };
    private UzemelesiAllapot allapot;

    public Kocsimoso() {
        this(5);
    }

    public Kocsimoso(int db) {
        ruhaDb = 0;
        ruhak = new Jarmu[db];
        allapot = UzemelesiAllapot.UZEMEL;
    }

    public void leeg() {
        allapot = UzemelesiAllapot.LEEGETT;
    }

    public UzemelesiAllapot getUzemel() {
        return allapot;
    }

    public boolean isUzemel() {
        return allapot == UzemelesiAllapot.UZEMEL;
    }

    public void bevesz(Jarmu jarmu) {
        if (allapot == UzemelesiAllapot.UZEMEL) {
            if (ruhaDb < ruhak.length) {
                ruhak[ruhaDb++] = jarmu;
            } else {
                System.out.println("A kocsimosó megtelt!");
            }
        } else {
            nemUzemel();
        }
    }

    public void altalanosMosas() {
        if (allapot == UzemelesiAllapot.UZEMEL) {
            for (Jarmu jarmu : ruhak) {
                if (jarmu != null) {
                    jarmu.setTiszta(true);
                    jarmu.kozepesMosas();
                }
            }
        } else {
            nemUzemel();
        }
    }

    public void kisMosas() {
        if (allapot == UzemelesiAllapot.UZEMEL) {
            for (Jarmu jarmu : ruhak) {
                if (jarmu != null) {
                    jarmu.setTiszta(true);
                    jarmu.kisMosas();
                }
            }
        } else {
            nemUzemel();
        }
    }

    public Jarmu kiad(String tulNeve) {
        Jarmu j = new NemLetezoJarmu();
        if (allapot == UzemelesiAllapot.UZEMEL) {
            int i = 0;
            while (ruhak[i] == null || i < ruhaDb && !(ruhak[i].getTulNev().equals(tulNeve))) {
                i++;
            }
            if (i < ruhaDb) {
                String tipus = ruhak[i] instanceof Jarmu ? "ruhája" : "inge";
                System.out.println("Kiadva %s %s!".formatted(tulNeve, tipus));
                j = ruhak[i];
                ruhak[i] = null;
            } else {
                System.out.println("Nincs ilyen ruha a mosodában!");
            }

        } else {
            nemUzemel();
        }

        return j;
    }

    public Jarmu[] getJarmuvek() {
        if (allapot == UzemelesiAllapot.UZEMEL) {
            Jarmu[] kiadottRuhak = new Jarmu[this.ruhak.length];
            for (int i = 0; i < ruhaDb; i++) {
                Jarmu aktualisRuha = this.ruhak[i];
                if (aktualisRuha != null) {
                    kiadottRuhak[i] = aktualisRuha;
                }
            }
            return kiadottRuhak;
        } else {
            nemUzemel();
            return new Jarmu[0];
        }
    }

    private void nemUzemel() {
        if (allapot == UzemelesiAllapot.NEM_UZEMEL) {
            System.out.println("A mosoda nem üzemel!");
        } else if (allapot == UzemelesiAllapot.LEEGETT) {
            System.out.println("A mosoda leégett!");
        }
    }

}
