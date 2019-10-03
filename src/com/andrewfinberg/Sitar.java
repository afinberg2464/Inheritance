package com.andrewfinberg;

public class Sitar extends Guitar {

    private String tuning;

    public Sitar(String make, String model, String bodyStyle, String bodyWood, String color, int frets, String tuning) {
        super(make, model, bodyStyle, bodyWood, color, frets);
        this.tuning = tuning;
    }

    public String getTuning() {
        return tuning;
    }

    public void setTuning(String tuning) {
        this.tuning = tuning;
    }

    @Override
    public String toString() {
        return "Sitar{" +
                "tuning='" + tuning + '\'' +
                '}';
    }
}