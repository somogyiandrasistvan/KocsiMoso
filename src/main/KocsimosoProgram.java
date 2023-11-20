package main;

import modell.Jarmu;
import modell.JarmuMeret;
import modell.Kamion;
import modell.Kocsi;
import modell.Kocsimoso;
import modell.Motor;

public class KocsimosoProgram {

    private Kocsimoso kocsimoso;

    public static void main(String[] args) {
        new KocsimosoProgram();
    }

    public KocsimosoProgram() {
        kocsimoso = new Kocsimoso(4);
        kocsimoso.bevesz(new Kamion("Péter"));
        kocsimoso.bevesz(new Kamion("Pál"));
        kocsimoso.bevesz(new Kocsi("Petra"));
        kocsimoso.bevesz(new Motor("Piroska"));

        System.out.println("--- kocsimosó járműi mosás előtt:");
        kocsimosoJarmui();

        System.out.println("--- kocsimosó járműi 2. ÁLTALÁNOS mosás után:");
        kocsimoso.altalanosMosas();
        kocsimoso.altalanosMosas();
        kocsimosoJarmui();

        System.out.println("--- kocsimosó járműi 5. KÍMÉLŐ mosás után:");
        for (int i = 0; i < 5; i++) {
            kocsimoso.kisMosas();
        }
        kocsimosoJarmui();

        System.out.println("--- kocsimosó járműi 10. ÁLTALÁNOS mosás után:");
        for (int i = 0; i < 5; i++) {
            kocsimoso.altalanosMosas();
        }
        kocsimosoJarmui();
    }

    private void kocsimosoJarmui() {
        for (Jarmu jarmu : kocsimoso.getJarmuvek()) {
            if (jarmu != null) {
                System.out.println(jarmu);
            }
        }
    }

}
