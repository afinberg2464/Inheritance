package com.andrewfinberg;

/**
 * This is the glockenspiel subclass of percussion
 * Created by Andrew Finberg 10/6/2019
 */
public class Glockenspiel extends Percussion {
    private String beaterType; // wood, felt

    public Glockenspiel(String section, boolean tuned, String beaterType) {
        super(section, tuned);
        this.beaterType = beaterType;
    }

    public String getBeaterType() {
        return beaterType;
    }

    public void setBeaterType(String beaterType) {
        this.beaterType = beaterType;
    }

    public String play() {
        return "Ding dong";
    }

    @Override
    public String toString() {
        return "Glockenspiel{" +
                "beaterType='" + beaterType + '\'' +
                '}';
    }
}
