package modell;

public class Mosoda {

    private Auto[] autok;
    private int autoDb;

    public Mosoda() {
        this(1);
    }

    public Mosoda(int db) {
        autoDb = 0;
        autok = new Auto[db];
    }

    public void bevesz(Auto auto) {
        if (autoDb < autok.length) {
            autok[autoDb++] = auto;
        } else {
            System.out.println("A mosoda megtelt!");
        }
    }

    public void mos() {
        for (Auto auto : autok) {
            if (auto.isTiszta()) {
                System.out.println(auto.getRendszam() + " rendszámú autó tiszta");
            }
            else{
                System.out.println(auto.getRendszam() + " rendszámú autó nem tiszta");
                
            }
        }
    }

}
