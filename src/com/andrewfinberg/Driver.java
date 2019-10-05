package com.andrewfinberg;

import java.util.ArrayList;

/**
 * Main method
 * Created by Andrew F 10/3/2019
 */
public class Driver {

    public static void main(String[] args) {

        ElectricGtr tylerGuitar = new ElectricGtr(
                "Tyler",
                "Burning Water",
                "Solid",
                "Stringwood",
                "BW2K",
                22,
                3800.0,
                "HSS",
                "Modern 2-Point Tremolo");
        tylerGuitar.useTremolo();

        AcousticGtr martinGuitar = new AcousticGtr(
                "Martin",
                "D-28",
                "Dreadnought",
                "Spruce",
                "Natural",
                20,
                4400.0,
                "Inlaid",
                "None",
                "Ebony");
        martinGuitar.useCapo();

        ArrayList<Guitar> guitars = new ArrayList<>();
        guitars.add(tylerGuitar);
        guitars.add(martinGuitar);

        //  Enhanced for loop
        for (Guitar instrument : guitars) {
            System.out.println(instrument.whereToBuy());
        }

        //  Lambda expression
        guitars.forEach((temp) -> {
            System.out.println(temp);
            System.out.println(temp.whereToBuy());
        });
    }
}
