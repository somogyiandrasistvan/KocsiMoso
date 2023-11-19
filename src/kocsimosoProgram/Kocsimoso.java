package kocsimosoProgram;

import modell.Auto;
import modell.Kamion;
import modell.Mosoda;
import modell.Motor;

public class Kocsimoso {

    private Mosoda mosoda;

    public static void main(String[] args) {
        new Kocsimoso();

    }

    public Kocsimoso() {
        mosoda = new Mosoda(4);
        mosoda.bevesz(new Kamion("aaa-123", "Ford"));
        mosoda.bevesz(new Motor("aaa-124", "Mustang"));
        mosoda.bevesz(new Kamion("aaa-113", "Ford"));
        mosoda.bevesz(new Motor("aaa-114", "Mustang"));

        System.out.println("--- mosoda autói mosás ELŐTT:");
        mosodaAutoi();

        System.out.println("");
        System.out.println("--- mosoda autói 1. mosás UTÁN:");
        mosoda.altalanosMosas();
        mosoda.altalanosMosas();
        mosodaAutoi();

        System.out.println("");
        System.out.println("--- mosoda autói 5. KÍMÉLŐ mosás után:");
        for (int i = 0; i < 4; i++) {
            mosoda.kimeloMosas();
        }
        mosodaAutoi();

        System.out.println("");
        System.out.println("--- mosoda autói 10. ÁLTALÁNOS mosás után:");
        for (int i = 0; i < 4; i++) {
            mosoda.altalanosMosas();
        }
        mosodaAutoi();

        System.out.println("");
        System.out.println("--- a mosodában maradt autók:");
        mosodaAutoi();

        System.out.println("");
        System.out.println("--- a mosodából kiadott autók:");
        mosoda.kiad("aaa-123", "Ford");
        mosoda.kiad("aaa-124", "Mustang");
        mosoda.kiad("aaa-113", "Ford");
        mosoda.kiad("aaa-113", "Mustang");

    }

    private void mosodaAutoi() {
        for (Auto auto : mosoda.getAutok()) {
            if (auto != null) {
                System.out.println(auto);
            }
        }
    }

}
