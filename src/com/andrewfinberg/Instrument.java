package com.andrewfinberg;

/**
 * This is the superclass for all instruments
 * Created by Andrew Finberg 10/6/2019
 */
public class Instrument {
    private String orchestraSection; //  percussion, brass, woodwind, strings

    /**
     * Default constructor
     *
     * @param section orchestra section
     */
    public Instrument(String section) {
        this.orchestraSection = section;
    }

    public String getOrchestraSection() {
        return orchestraSection;
    }

    public void setOrchestraSection(String orchestraSection) {
        this.orchestraSection = orchestraSection;
    }

    public String play() {
        return "I don't know what sound to make";
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "section='" + orchestraSection + '\'' +
                '}';
    }
}
