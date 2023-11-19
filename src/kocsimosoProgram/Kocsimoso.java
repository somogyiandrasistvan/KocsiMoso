package kocsimosoProgram;

import modell.Auto;
import modell.Mosoda;
import modell.Motor;

public class Kocsimoso {

    private Mosoda mosoda;

    public static void main(String[] args) {
        new Kocsimoso();

    }

    public Kocsimoso() {
        mosoda = new Mosoda(4);
        mosoda.bevesz(new Auto("aaa-123", "Ford"));
        mosoda.bevesz(new Motor("aaa-124", "Mustang"));
        mosoda.bevesz(new Auto("aaa-113", "Ford"));
        mosoda.bevesz(new Motor("aaa-114", "Mustang"));

        System.out.println("--- mosoda autói mosás ELŐTT:");
        mosodaAutoi();

        System.out.println("--- mosoda autói 1. mosás UTÁN:");
        mosoda.mos();
        mosodaAutoi();

        System.out.println("--- mosoda autói 2. mosás UTÁN:");
        mosoda.mos();
        mosodaAutoi();

        mosoda.kiad("aaa-123");
        mosoda.kiad("aaa-124");
        mosoda.kiad("aaa-113");
        mosoda.kiad("aaa-114");
        
        System.out.println("--- a mosodában maradt ruhák:");
        mosodaAutoi();

    }

    private void mosodaAutoi() {
        for (String auto : mosoda.getAutok()) {
            if (auto != null) {
                System.out.println(auto);
            }
        }
    }

}
