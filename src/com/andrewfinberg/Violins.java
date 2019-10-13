package com.andrewfinberg;

/**
 * This is the violins subclass of strings
 * Created by dev 10/6/2019
 */
public class Violins extends Strings implements IStrings {

    private String stringSection; // first violins, second violins

    /**
     * Default constructor
     *
     * @param section       section (strings, percussion, woodwinds, brass)
     * @param numStrings    number of strings on the instrument
     * @param stringSection first violins, second violins
     */
    Violins(String section, int numStrings, String stringSection) {
        super(section, numStrings);
        this.stringSection = stringSection;
    }

    /**
     *  Accessor for string section
     * @return string section
     */
    public String getStringSection() {
        return stringSection;
    }

    /**
     * Mutator for string section
     * @param stringSection string section
     */
    public void setStringSection(String stringSection) {
        this.stringSection = stringSection;
    }

    /**
     * Override method to pluck strings
     */
    @Override
    public void pluckStrings() {

    }

    /**
     * Override method to play staccato
     */
    @Override
    public void playBowStaccato() {

    }

    /**
     * Override method to play legato
     */
    @Override
    public void playBowLegato() {

    }

    /**
     * Override method to play tremolo
     */
    @Override
    public void playBowTremolo() {

    }

    @Override
    public String toString() {
        return "Violins{" +
                "stringSection='" + stringSection + '\'' +
                '}';
    }

}
