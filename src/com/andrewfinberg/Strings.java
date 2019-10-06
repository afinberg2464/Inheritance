package com.andrewfinberg;

public class Strings extends Instrument {
    private int numStrings;

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
