package main;

import modell.Jarmu;
import modell.Kamion;
import modell.Kocsimoso;
import modell.Motor;

public class KocsimosoProgram {

    private Kocsimoso kocsimosoda;

    public static void main(String[] args) {
        new KocsimosoProgram();
    }

    public KocsimosoProgram() {

        kocsimosoda = new Kocsimoso(4);
        System.out.println("-- bemegy:");
        kocsimosoda.bemegy(new Motor("342-WWW", "BMW"));
        kocsimosoda.kimegy();
        kocsimosoda.bemegy(new Kamion("432-WFG", "Ford", 1.3, 1.3));
        kocsimosoda.gyengebbMosas();
        kocsimosoda.tonkrement();
        System.out.println(kocsimosoda.getJarmuvek());

    }

}
