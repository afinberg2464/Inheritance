package com.andrewfinberg;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Main method
 * Created by Andrew F 10/3/2019
 */
public class Driver {

    public static void main(String[] args) {

        ElectricGtr electricGtr = new ElectricGtr(
                "Tyler",
                "Burning Water",
                "Solid",
                "Stringwood",
                "BW2K",
                22,
                3800.0,
                "HSS",
                "Modern 2-Point Tremolo");
        electricGtr.useTremolo();

        AcousticGtr acousticGtr = new AcousticGtr(
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
        acousticGtr.useCapo();

        ArrayList<Guitar> guitars = new ArrayList<>();
        guitars.add(electricGtr);
        guitars.add(acousticGtr);

    }
}
