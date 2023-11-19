package modell;

public class Kocsimoso {

    private Auto[] auto;
    private boolean szabad;

    public Kocsimoso(int db) {
        auto = new Auto[db];
        szabad = true;
    }

    public void bemegy(Auto kocsi) {
        if (szabad == true) {
            auto[0] = kocsi;
            szabad = false;
            System.out.println("Bekerült egy auto!");
        } else {
            System.out.println("Foglalt a Kocsimoso!");
        }
    }

    public void normalMosas() {
        auto[0].setTiszta(true);
    }

    public void kimegy() {
        auto[0] = null;
    }

    public String getAutok() {
        if (auto[0] != null) {
            return auto[0].toString();
        }else{
            return "üres a kocsimoso!";
        }
    }

}
