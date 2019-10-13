package com.andrewfinberg;

/**
 * This is the superclass for all instruments
 * Created by dev 10/6/2019
 */
public abstract class Instrument {

    private String orchestraSection;

    /**
     * Default constructor
     *
     * @param section orchestra section
     */
    Instrument(String section) {
        this.orchestraSection = section;
    }

    public String getOrchestraSection() {
        return orchestraSection;
    }

    public void setOrchestraSection(String orchestraSection) {
        this.orchestraSection = orchestraSection;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "section='" + orchestraSection + '\'' +
                '}';
    }

    public String play() {
        return "Generic sound";
    }
}
