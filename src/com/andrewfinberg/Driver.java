package com.andrewfinberg;

import java.util.ArrayList;

/**
 * Created by dev 10/3/2019
 */
public class Driver {

    public static void main(String[] args) {

        Violins violin = new Violins("Strings", 4, "First");
        String section = violin.getOrchestraSection();
        String stringSection = violin.getStringSection();
        violin.playBowLegato();
        violin.playBowStaccato();
        violin.playBowTremolo();
        violin.pluckStrings();

        Glockenspiel glockenspiel = new Glockenspiel("Percussion", true, "Felt");
        String beaterType = glockenspiel.getBeaterType();
        glockenspiel.playBrushes();
        glockenspiel.playMallets();
        glockenspiel.playSticks();

    }
}
