package com.andrewfinberg;

/**
 * This is the string subclass of instruments
 * Created by Andrew Finberg 10/6/2019
 */
public class Strings extends Instrument {
    private int numStrings;

    /**
     * Default constructor
     * @param section       section (strings, percussion, woodwinds, brass)
     * @param numStrings    number of strings on the instrument
     */
    public Strings(String section, int numStrings) {
        super(section);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public String play() {
        return "Lush strings pad sound here";
    }

    @Override
    public String toString() {
        return "Strings{" +
                "numStrings=" + numStrings +
                '}';
    }
}
