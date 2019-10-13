package com.andrewfinberg;

/**
 * This is the glockenspiel subclass of percussion
 * Created by dev 10/6/2019
 */
public class Glockenspiel extends Percussion implements IPercussion {

    private String beaterType; // wood, felt

    /**
     * Default constructor
     *
     * @param section    section
     * @param tuned      tuned
     * @param beaterType beater type
     */
    Glockenspiel(String section, boolean tuned, String beaterType) {
        super(section, tuned);
        this.beaterType = beaterType;
    }

    /**
     * Accessor to get beater type
     * @return beater type
     */
    public String getBeaterType() {
        return beaterType;
    }

    /**
     * Mutator to set beater type
     * @param beaterType beater type
     */
    public void setBeaterType(String beaterType) {
        this.beaterType = beaterType;
    }

    /**
     * Override method to play brushes
     */
    @Override
    public void playBrushes() {

    }

    /**
     * Override method to play mallets
     */
    @Override
    public void playMallets() {

    }

    /**
     * Override method to play sticks
     */
    @Override
    public void playSticks() {

    }

    @Override
    public String toString() {
        return "Glockenspiel{" +
                "beaterType='" + beaterType + '\'' +
                '}';
    }
}
