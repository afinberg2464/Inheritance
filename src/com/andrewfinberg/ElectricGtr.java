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
     * @param make
     * @param model
     * @param bodyStyle
     * @param bodyWood
     * @param color
     * @param frets
     * @param pickupType
     * @param bridgeType
     */
    public ElectricGtr(String make, String model, String bodyStyle, String bodyWood, String color, int frets, String pickupType, String bridgeType) {
        super(make, model, bodyStyle, bodyWood, color, frets);
        this.pickupType = pickupType;
        this.bridgeType = bridgeType;
    }

    /**
     * Returns pickup type
     *
     * @return pickup type
     */
    public String getPickupType() {
        return pickupType;
    }

    public void setPickupType(String pickupType) {
        this.pickupType = pickupType;
    }

    /**
     * Returns bridge type
     *
     * @return bridge type
     */
    public String getBridgeType() {
        return bridgeType;
    }

    public void setBridgeType(String bridgeType) {
        this.bridgeType = bridgeType;
    }

    @Override
    public String toString() {
        return "ElectricGtr{" +
                "pickupType='" + pickupType + '\'' +
                ", bridgeType='" + bridgeType + '\'' +
                '}';
    }
}
