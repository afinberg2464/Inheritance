package com.andrewfinberg;

public class AcousticGuitar extends Guitar {
    private String soundHole;
    private String braceWood;
    private String type;

    public AcousticGuitar(String make,
                          String model,
                          String color,
                          int scaleLength,
                          String bodyWood,
                          String neckWood,
                          int numFrets,
                          String fretMaterial,
                          String soundHole,
                          String braceWood,
                          String type) {
        super(make, model, color, scaleLength, bodyWood, neckWood, numFrets, fretMaterial);
        this.soundHole = soundHole;
        this.braceWood = braceWood;
        this.type = type;
    }

    public String getSoundHole() {
        return soundHole;
    }

    public String getBraceWood() {
        return braceWood;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "AcousticGuitar{" +
                "soundHole='" + soundHole + '\'' +
                ", braceWood='" + braceWood + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
