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
     * @param make make
     * @param model model
     * @param bodyStyle body style
     * @param bodyWood body wood
     * @param finishColor finish color
     * @param frets number of frets
     * @param cost cost
     * @param soundHole sound hole design
     * @param cutaway cutaway style
     * @param bridgeWood bridge wood
     */
    public AcousticGtr(String make,
                       String model,
                       String bodyStyle,
                       String bodyWood,
                       String finishColor,
                       int frets,
                       double cost,
                       String soundHole,
                       String cutaway, String bridgeWood) {
        super(make, model, bodyStyle, bodyWood, finishColor, frets, cost);
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

    /**
     * Method to use capo
     */
    public void useCapo() {

    }

    public String whereToBuy() {
        return "Buy me at Wilcutt's Guitars in Lexington, KY";
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
