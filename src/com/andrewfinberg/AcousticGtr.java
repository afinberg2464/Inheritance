package com.andrewfinberg;

/**
 * Sub-class for acoustic guitars
 * Created by Andrew F 10/3/2019
 */
public class AcousticGtr extends Guitar {
    private String soundHole;
    private String cutaway;
    private String bridgeWood;

    /**
     * Default constructor
     *
     * @param soundHole
     * @param cutaway
     * @param bridgeWood
     */
    public AcousticGtr(String soundHole, String cutaway, String bridgeWood) {
        this.soundHole = soundHole;
        this.cutaway = cutaway;
        this.bridgeWood = bridgeWood;
    }

    /**
     * Returns sound hole
     *
     * @return sound hole
     */
    public String getSoundHole() {
        return soundHole;
    }

    public void setSoundHole(String soundHole) {
        this.soundHole = soundHole;
    }

    /**
     * Returns cutaway
     * @return cutaway
     */
    public String getCutaway() {
        return cutaway;
    }

    public void setCutaway(String cutaway) {
        this.cutaway = cutaway;
    }

    /**
     * Returns bridge wood
     * @return bridge wood
     */
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
                '}';
    }
}
