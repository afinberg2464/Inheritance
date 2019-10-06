package com.andrewfinberg;

import java.util.ArrayList;

/**
 * Main method
 * Created by Andrew F 10/3/2019
 */
public class Driver {

    public static void main(String[] args) {

        Instrument violin = new Violins("Violins", 4, "First");
        Instrument glockenspiel = new Glockenspiel("Percussion", true, "Felt");

        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(violin);
        instruments.add(glockenspiel);

        //  Lambda expression
        instruments.forEach((temp) -> {
            System.out.println(temp);
            System.out.println(temp.play());
        });

        int countStrings = 0;
        int countPercussion = 0;
        for (Instrument instrument : instruments) {
            if (instrument instanceof Percussion) {
                countPercussion++;
            } else if (instrument instanceof Strings) {
                countStrings++;
            }
        }
    }
}
