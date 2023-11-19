package main;

import modell.Auto;
import modell.Kocsimoso;

public class KocsimosoProgram {

    private Kocsimoso kocsimosoda;

    public static void main(String[] args) {
        new KocsimosoProgram();
    }

    public KocsimosoProgram() {

        kocsimosoda = new Kocsimoso(4);
        kocsimosoda.bemegy(new Auto("342-WWW", "BMW"));
        kocsimosoda.bemegy(new Auto("432-WFG", "Ford"));
        System.out.println(kocsimosoda.getAutok());
        kocsimosoda.normalMosas();
        System.out.println(kocsimosoda.getAutok());

        kocsimosoda.kimegy();
        System.out.println(kocsimosoda.getAutok());

    }

}
