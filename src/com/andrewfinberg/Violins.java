package com.andrewfinberg;

/**
 * This is the violins subclass of strings
 * Created by Andrew Finberg 10/6/2019
 */
public class Violins extends Strings {
    private String stringSection; // first violins, second violins

    /**
     * Default constructor
     * @param section           section (strings, percussion, woodwinds, brass)
     * @param numStrings        number of strings on the instrument
     * @param stringSection     first violins, second violins
     */
    public Violins(String section, int numStrings, String stringSection) {
        super(section, numStrings);
        this.stringSection = stringSection;
    }

    public String getStringSection() {
        return stringSection;
    }

    public void setStringSection(String stringSection) {
        this.stringSection = stringSection;
    }

    public String play() {
        return "Violin solo!";
    }

    @Override
    public String toString() {
        return "Violins{" +
                "stringSection='" + stringSection + '\'' +
                '}';
    }
}
