package modell;

import static modell.JarmuMeret.NAGY;
import static modell.JarmuMeret.KOZEPES;
import static modell.JarmuMeret.KICSI;

public class Kocsimoso {

    private Jarmu[] jarmuvek;
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
        jarmuvek = new Jarmu[db];
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
            if (ruhaDb < jarmuvek.length) {
                jarmuvek[ruhaDb++] = jarmu;
            } else {
                System.out.println("A kocsimosó megtelt!");
            }
        } else {
            nemUzemel();
        }
    }

    public void nagyMosas() {
        if (allapot == UzemelesiAllapot.UZEMEL) {
            for (Jarmu jarmu : jarmuvek) {
                if (jarmu != null) {
                    jarmu.setTiszta(true);
                    jarmu.nagyMosas();
                }
            }
        } else {
            nemUzemel();
        }
    }

    public void kozepesMosas() {
        if (allapot == UzemelesiAllapot.UZEMEL) {
            for (Jarmu jarmu : jarmuvek) {
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
            for (Jarmu jarmu : jarmuvek) {
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
            while (jarmuvek[i] == null || i < ruhaDb && !(jarmuvek[i].getTulNev().equals(tulNeve))) {
                i++;
            }
            if (i < ruhaDb) {
                String tipus = jarmuvek[i] instanceof Jarmu ? "ruhája" : "inge";
                System.out.println("Kiadva %s %s!".formatted(tulNeve, tipus));
                j = jarmuvek[i];
                jarmuvek[i] = null;
            } else {
                System.out.println("Nincs ilyen jarmu a mosodában!");
            }

        } else {
            nemUzemel();
        }

        return j;
    }

    public Jarmu[] getJarmuvek() {
        if (allapot == UzemelesiAllapot.UZEMEL) {
            Jarmu[] kiadottRuhak = new Jarmu[this.jarmuvek.length];
            for (int i = 0; i < ruhaDb; i++) {
                Jarmu aktualisRuha = this.jarmuvek[i];
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
            System.out.println("A kocsimosó nem üzemel!");
        } else if (allapot == UzemelesiAllapot.LEEGETT) {
            System.out.println("A kocsimosó leégett!");
        }
    }

}
