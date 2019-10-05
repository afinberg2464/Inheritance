package com.andrewfinberg;

/**
 * Main method
 * Created by Andrew F 10/3/2019
 */
public class Driver {

    public static void main(String[] args) {

        ElectricGtr electricGtr = new ElectricGtr(
                "Fender",
                "Stratocaster",
                "Solid",
                "Swamp Ash",
                "Seafoam Green",
                22,
                "Vintage Single Coil",
                "Vintage Tremolo");

        electricGtr.useTremolo();

        AcousticGtr acousticGtr = new AcousticGtr(
                "Martin",
                "D-28",
                "Dreadnought",
                "Spruce",
                "Natural",
                20,
                "Round Carved Inlay",
                "None",
                "Rosewood");

        acousticGtr.useCapo();


    }
}
