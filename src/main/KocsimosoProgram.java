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
        kocsimoso.bevesz(new Kamion("Optimus 6542"));
        kocsimoso.bevesz(new Kamion("Megatron 3456", JarmuMeret.TUL_NAGY));
        kocsimoso.bevesz(new Kocsi("Nissan 1234"));
        kocsimoso.bevesz(new Motor("Nagasaki 9876"));

        System.out.println("--- kocsimosó járműi mosás előtt:");
        kocsimosoJarmui();

        System.out.println("--- kocsimosó járműi 2. ÁLTALÁNOS mosás után:");
        kocsimoso.kozepesMosas();
        kocsimoso.kozepesMosas();
        kocsimosoJarmui();

        System.out.println("--- kocsimosó járműi 5. KÍMÉLŐ mosás után:");
        for (int i = 0; i < 5; i++) {
            kocsimoso.kisMosas();
        }
        kocsimosoJarmui();

        System.out.println("--- kocsimosó járműi 10. ÁLTALÁNOS mosás után:");
        for (int i = 0; i < 5; i++) {
            kocsimoso.kozepesMosas();
        }
        kocsimosoJarmui();
    }

    private void kocsimosoJarmui() {
        for (Jarmu jarmu : kocsimoso.getJarmuvek()) {
            if (jarmu != null) {
                System.out.println(jarmu);
            }
        }
        System.out.println("");
    }

}
