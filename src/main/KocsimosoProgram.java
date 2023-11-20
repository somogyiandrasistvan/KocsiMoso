package main;

import modell.Jarmu;
import modell.Kocsimoso;
import modell.Motor;

public class KocsimosoProgram {

    private Kocsimoso kocsimosoda;

    public static void main(String[] args) {
        new KocsimosoProgram();
    }

    public KocsimosoProgram() {

        kocsimosoda = new Kocsimoso(4);
        kocsimosoda.bemegy(new Motor("342-WWW", "BMW"));
        kocsimosoda.bemegy(new Motor("432-WFG", "Ford"));
        System.out.println(kocsimosoda.getJarmuvek());
        kocsimosoda.normalMosas();
        System.out.println(kocsimosoda.getJarmuvek());

        kocsimosoda.kimegy();
        System.out.println(kocsimosoda.getJarmuvek());

    }

}
