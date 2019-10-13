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

    public String getBeaterType() {
        return beaterType;
    }

    public void setBeaterType(String beaterType) {
        this.beaterType = beaterType;
    }

    @Override
    public String toString() {
        return "Glockenspiel{" +
                "beaterType='" + beaterType + '\'' +
                '}';
    }

    @Override
    public void playBrushes() {

    }

    @Override
    public void playMallets() {

    }

    @Override
    public void playSticks() {

    }

    @Override
    public void playHands() {

    }

    @Override
    public String play() {
        return "Ding dong!";
    }
}
