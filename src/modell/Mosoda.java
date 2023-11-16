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
            if(auto != null){
                if(auto instanceof Kocsi){
                    Kocsi kocsi = (Kocsi) auto;
                    kocsi.setTisztasag(kocsi.getTisztasag() * 0.97);
                }
                auto.setTiszta(true);
            }
        }
    }
    
    public void kiad(String rendszam){
        int i = 0;
        while(i < autoDb && autok[i] != null && !(autok[i].getRendszam().equals(rendszam))){
            i++;
        }
        if(i < autoDb){
            String tipus = autok[i] instanceof Auto ? "autója" : "motorja";
            System.out.println("Kiadva %s %s!".formatted(rendszam, tipus));
            autok[i] = null;
        }else{
            System.out.println("Nincs ilyen ruha a mosodában!");
        }
    }
    
    public String[] getAutok() {
        String[] ruhak = new String[this.autok.length];
        for (int i = 0; i < autoDb; i++) {
            Auto auto = this.autok[i];
            if(auto != null){
                ruhak[i] = auto.toString();

            }
        }
        return ruhak;
    }

}
