package com.andrewfinberg;

/**
 * This is the string subclass of instruments
 * Created by dev 10/6/2019
 */
public abstract class Strings extends Instrument {

    private int numStrings;

    /**
     * Default constructor
     *
     * @param section    section (strings, percussion, woodwinds, brass)
     * @param numStrings number of strings on the instrument
     */
    Strings(String section, int numStrings) {
        super(section);
        this.numStrings = numStrings;
    }

    /**
     * Accessor for number of strings
     * @return number of strings
     */
    public int getNumStrings() {
        return numStrings;
    }

    /**
     * Mutator for number of strings
     * @param numStrings number of strings
     */
    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    @Override
    public String toString() {
        return "Strings{" +
                "numStrings=" + numStrings +
                '}';
    }
}
