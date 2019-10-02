package com.andrewfinberg;

public class Guitar {
    protected String make;
    protected String model;
    protected String color;
    protected double scaleLength;
    protected String bodyWood;
    protected String neckWood;
    protected int numFrets;
    protected String fretMaterial;

    public Guitar(String make,
                  String model,
                  String color,
                  double scaleLength,
                  String bodyWood,
                  String neckWood,
                  int numFrets,
                  String fretMaterial) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.scaleLength = scaleLength;
        this.bodyWood = bodyWood;
        this.neckWood = neckWood;
        this.numFrets = numFrets;
        this.fretMaterial = fretMaterial;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getScaleLength() {
        return scaleLength;
    }

    public String getBodyWood() {
        return bodyWood;
    }

    public String getNeckWood() {
        return neckWood;
    }

    public int getNumFrets() {
        return numFrets;
    }

    public String getFretMaterial() {
        return fretMaterial;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setScaleLength(double scaleLength) {
        this.scaleLength = scaleLength;
    }

    public void setBodyWood(String bodyWood) {
        this.bodyWood = bodyWood;
    }

    public void setNeckWood(String neckWood) {
        this.neckWood = neckWood;
    }

    public void setNumFrets(int numFrets) {
        this.numFrets = numFrets;
    }

    public void setFretMaterial(String fretMaterial) {
        this.fretMaterial = fretMaterial;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", scaleLength=" + scaleLength +
                ", bodyWood='" + bodyWood + '\'' +
                ", neckWood='" + neckWood + '\'' +
                ", numFrets=" + numFrets +
                ", fretMaterial=" + fretMaterial +
                '}';
    }
}


