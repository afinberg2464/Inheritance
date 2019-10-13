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

    /**
     * Accessor for orchestra section
     *
     * @return orchestra section
     */
    public String getOrchestraSection() {
        return orchestraSection;
    }

    /**
     * Mutator for orchestra section
     *
     * @param orchestraSection orchestra section
     */
    public void setOrchestraSection(String orchestraSection) {
        this.orchestraSection = orchestraSection;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "section='" + orchestraSection + '\'' +
                '}';
    }
}
