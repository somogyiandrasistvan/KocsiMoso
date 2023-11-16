package kocsimosoProgram;

import modell.Auto;
import modell.Mosoda;

public class Kocsimoso {

    private Mosoda mosoda;

    public static void main(String[] args) {
        new Kocsimoso();

    }

    public Kocsimoso() {
        mosoda = new Mosoda(2);
        mosoda.bevesz(new Auto("aaa-123", "Ford"));
        mosoda.bevesz(new Auto("aaa-124", "Mustang"));
        
        System.out.println("--- mosoda autói mosás ELŐTT:");
        mosodaRuhai();
        
        System.out.println("--- mosoda autói 1. mosás UTÁN:");
        mosoda.mos();
        mosodaRuhai();
        
        System.out.println("--- mosoda autói 2. mosás UTÁN:");
        mosoda.mos();
        mosodaRuhai();
        
        mosoda.kiad("aaa-123");
        mosoda.kiad("aaa-124");
        System.out.println("--- a mosodában maradt ruhák:");
        mosodaRuhai();

    }
    
    private void mosodaRuhai() {
        for (String auto : mosoda.getAutok()) {
                if (auto != null) {
                    System.out.println(auto);
            }
        }
    }

}
