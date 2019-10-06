package com.andrewfinberg;

public class Instrument {
    private String orchestraSection; //  percussion, brass, woodwind, strings

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
