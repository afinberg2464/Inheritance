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

    public String getStringSection() {
        return stringSection;
    }

    public void setStringSection(String stringSection) {
        this.stringSection = stringSection;
    }

    @Override
    public String toString() {
        return "Violins{" +
                "stringSection='" + stringSection + '\'' +
                '}';
    }

    @Override
    public void pluckStrings() {

    }

    @Override
    public void playBowStaccato() {

    }

    @Override
    public void playBowLegato() {

    }

    @Override
    public void playBowTremolo() {

    }

    @Override
    public String play() {
        return "Violin solo!";
    }
}
