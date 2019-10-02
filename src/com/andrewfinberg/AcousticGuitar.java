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

    public void setSoundHole(String soundHole) {
        this.soundHole = soundHole;
    }

    public void setBraceWood(String braceWood) {
        this.braceWood = braceWood;
    }

    public void setType(String type) {
        this.type = type;
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
