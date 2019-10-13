package com.andrewfinberg;

/**
 * This is the percussion subclass of instruments
 * Created by dev 10/6/2019
 */
public abstract class Percussion extends Instrument {

    private boolean tuned;

    /**
     * Default constructor
     *
     * @param section section (strings, percussion, woodwinds, brass)
     * @param tuned   tuned percussion: true (i.e. xylophone) or false (snare drum)
     */
    Percussion(String section, boolean tuned) {
        super(section);
        this.tuned = tuned;
    }

    /**
     * Returns whether the percussion is tuned
     * @return
     */
    public boolean isTuned() {
        return tuned;
    }

    /**
     * Mutator to set whether the percussion is tuned
     * @param tuned
     */
    public void setTuned(boolean tuned) {
        this.tuned = tuned;
    }

    @Override
    public String toString() {
        return "Percussion{" +
                "tuned=" + tuned +
                '}';
    }
}
