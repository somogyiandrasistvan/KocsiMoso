package modell;

public class Kocsimoso {

    private Jarmu[] jarmu;
    private boolean szabad;

    public Kocsimoso(int db) {
        jarmu = new Jarmu[db];
        szabad = true;
    }

    public void bemegy(Jarmu kocsi) {
        if (szabad == true) {
            jarmu[0] = kocsi;
            szabad = false;
            System.out.println("Bekerült egy auto!");
        } else {
            System.out.println("Foglalt a Kocsimoso!");
        }
    }

    public void normalMosas() {
        jarmu[0].setTiszta(true);
        jarmu[0].normalMosas();
    }

    public void gyengebbMosas() {
        jarmu[0].setTiszta(true);
        jarmu[0].gyengebbMosas();
    }

    public void kimegy() {
        jarmu[0] = null;
    }

    public String getJarmuvek() {
        if (jarmu[0] != null) {
            return jarmu[0].toString();
        } else {
            return "üres a kocsimoso!";
        }
    }

}
