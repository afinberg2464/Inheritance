package com.andrewfinberg;

public class Guitar {
    private String make;
    private String model;
    private String color;
    private double scaleLength;
    private String bodyWood;
    private String neckWood;
    private int numFrets;
    private String fretMaterial;

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


