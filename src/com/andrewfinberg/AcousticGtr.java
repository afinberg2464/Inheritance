package com.andrewfinberg;

public class AcousticGtr extends Guitar {
    private String soundHole;
    private String cutaway;
    private String bridgeWood;

    public AcousticGtr(String soundHole, String cutaway, String bridgeWood) {
        this.soundHole = soundHole;
        this.cutaway = cutaway;
        this.bridgeWood = bridgeWood;
    }

    public String getSoundHole() {
        return soundHole;
    }

    public void setSoundHole(String soundHole) {
        this.soundHole = soundHole;
    }

    public String getCutaway() {
        return cutaway;
    }

    public void setCutaway(String cutaway) {
        this.cutaway = cutaway;
    }

    public String getBridgeWood() {
        return bridgeWood;
    }

    public void setBridgeWood(String bridgeWood) {
        this.bridgeWood = bridgeWood;
    }

    @Override
    public String toString() {
        return "AcousticGtr{" +
                "soundHole='" + soundHole + '\'' +
                ", cutaway='" + cutaway + '\'' +
                ", bridgeWood='" + bridgeWood + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", bodyStyle='" + bodyStyle + '\'' +
                ", bodyWood='" + bodyWood + '\'' +
                ", color='" + color + '\'' +
                ", frets=" + frets +
                '}';
    }
}
