package com.andrewfinberg;

/**
 * Sub-class for electric guitars
 * Created by Andrew F 10/3/2019
 */
public class ElectricGtr extends Guitar {
    private String pickupType;
    private String bridgeType;

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
     * @param pickupType pickup type
     * @param bridgeType bridge type
     */
    public ElectricGtr(String make,
                       String model,
                       String bodyStyle,
                       String bodyWood,
                       String finishColor,
                       int frets,
                       double cost,
                       String pickupType,
                       String bridgeType) {
        super(make, model, bodyStyle, bodyWood, finishColor, frets, cost);
        this.pickupType = pickupType;
        this.bridgeType = bridgeType;
    }

    public String getPickupType() {
        return pickupType;
    }

    public void setPickupType(String pickupType) {
        this.pickupType = pickupType;
    }

    public String getBridgeType() {
        return bridgeType;
    }

    public void setBridgeType(String bridgeType) {
        this.bridgeType = bridgeType;
    }

    /**
     * Method to use tremolo
     */
    public void useTremolo() {

    }

    @Override
    public String toString() {
        return "ElectricGtr{" +
                "pickupType='" + pickupType + '\'' +
                ", bridgeType='" + bridgeType + '\'' +
                '}';
    }
}
