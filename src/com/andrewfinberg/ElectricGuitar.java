package com.andrewfinberg;

public class ElectricGuitar extends Guitar {
    private int numPickups;
    private String pickupType;
    private String pickupConfig;
    private int volumeKnobs;
    private int toneKnobs;
    private int selectorSwitch;

    public ElectricGuitar(String make,
                          String model,
                          String color,
                          int scaleLength,
                          String bodyWood,
                          String neckWood,
                          int numFrets,
                          String fretMaterial,
                          int numPickups,
                          String pickupType,
                          String pickupConfig,
                          int volumeKnobs,
                          int toneKnobs,
                          int selectorSwitch) {
        super(make, model, color, scaleLength, bodyWood, neckWood, numFrets, fretMaterial);
        this.numPickups = numPickups;
        this.pickupType = pickupType;
        this.pickupConfig = pickupConfig;
        this.volumeKnobs = volumeKnobs;
        this.toneKnobs = toneKnobs;
        this.selectorSwitch = selectorSwitch;
    }

    public int getNumPickups() {
        return numPickups;
    }

    public String getPickupType() {
        return pickupType;
    }

    public String getPickupConfig() {
        return pickupConfig;
    }

    public int getVolumeKnobs() {
        return volumeKnobs;
    }

    public int getToneKnobs() {
        return toneKnobs;
    }

    public int getSelectorSwitch() {
        return selectorSwitch;
    }

    @Override
    public String toString() {
        return "ElectricGuitar{" +
                "numPickups=" + numPickups +
                ", pickupType='" + pickupType + '\'' +
                ", pickupConfig='" + pickupConfig + '\'' +
                ", volumeKnobs=" + volumeKnobs +
                ", toneKnobs=" + toneKnobs +
                ", selectorSwitch=" + selectorSwitch +
                '}';
    }
}
