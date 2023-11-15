package main;

import modell.Kocsimoso;

public class KocsimosoProgram {

    private Kocsimoso kocsimoso;

    public static void main(String[] args) {
        new KocsimosoProgram();
    }

    public KocsimosoProgram() {
        kocsimoso = new Kocsimoso(4);
        kocsimoso.bevesz(new Pulover("Péter"));
        kocsimoso.bevesz(new Pulover("Pál", RuhaMeret.GYEREK));
        kocsimoso.bevesz(new Ing("Petra"));
        kocsimoso.bevesz(new Ing("Piroska"));

        System.out.println("--- mosoda ruhái mosás előtt:");
        mosodaRuhai();

        System.out.println("--- mosoda ruhái 2. ÁLTALÁNOS mosás után:");
        kocsimoso.altalanosMosas();
        kocsimoso.altalanosMosas();
        mosodaRuhai();

        System.out.println("--- mosoda ruhái 5. KÍMÉLŐ mosás után:");
        for (int i = 0; i < 5; i++) {
            kocsimoso.kimeloMosas();
        }
        mosodaRuhai();

        System.out.println("--- mosoda ruhái 10. ÁLTALÁNOS mosás után:");
        for (int i = 0; i < 5; i++) {
            kocsimoso.altalanosMosas();
        }
        mosodaRuhai();
    }

    private void mosodaRuhai() {
        for (Ruha ruha : kocsimoso.getRuhak()) {
            if (ruha != null) {
                System.out.println(ruha);
            }
        }
    }

}
