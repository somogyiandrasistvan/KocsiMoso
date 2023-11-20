package modell;

public class Kocsimoso {

    private Jarmu[] jarmu;
    private boolean szabad;
    private boolean tonkrement;

    public Kocsimoso(int db) {
        jarmu = new Jarmu[db];
        szabad = true;
        tonkrement = false;
    }

    public void tonkrement() {
        tonkrement = true;
        kimegy();
    }

    public void megjavul() {
        tonkrement = false;
    }

    public void bemegy(Jarmu kocsi) {
        if (tonkrement == false) {
            if (szabad == true) {
                jarmu[0] = kocsi;
                szabad = false;
                System.out.println("Bekerült egy auto!");
            } else {
                System.out.println("Foglalt a Kocsimoso!");
            }
        } else {
            System.out.println("A kocsimoso elromlott! Nem tudd járművet fogadni!");
        }
    }

    public void normalMosas() {
        if (tonkrement == false) {
            jarmu[0].setTiszta(true);
            jarmu[0].normalMosas();
        } else {
            System.out.println("A kocsimoso elromlott! Nem tudd mosni!");
        }
    }

    public void gyengebbMosas() {
        if (tonkrement == false) {
            jarmu[0].setTiszta(true);
            jarmu[0].gyengebbMosas();
        } else {
            System.out.println("A kocsimoso elromlott! Nem tudd mosni!");
        }
    }

    public void kimegy() {
        jarmu[0] = null;
        szabad = true;
    }

    public String getJarmuvek() {
        if (jarmu[0] != null) {
            return jarmu[0].toString();
        } else {
            return "Üres a kocsimoso!";
        }
    }

}
