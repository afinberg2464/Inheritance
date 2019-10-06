package com.andrewfinberg;

public class Percussion extends Instrument {
    private boolean tuned;

    public Percussion(String section, boolean tuned) {

        super(section);
        this.tuned = tuned;
    }

    public boolean isTuned() {
        return tuned;
    }

    public void setTuned(boolean tuned) {
        this.tuned = tuned;
    }

    public String play() {
        return "Percussion section jam";
    }

    @Override
    public String toString() {
        return "Percussion{" +
                "tuned=" + tuned +
                '}';
    }
}
