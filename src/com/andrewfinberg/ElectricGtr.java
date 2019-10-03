package com.andrewfinberg;

public class ElectricGtr extends Guitar {
    private String pickupType;
    private String bridgeType;

    public ElectricGtr(String pickupType, String bridgeType) {
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

    @Override
    public String toString() {
        return "ElectricGtr{" +
                "pickupType='" + pickupType + '\'' +
                ", bridgeType='" + bridgeType + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", bodyStyle='" + bodyStyle + '\'' +
                ", bodyWood='" + bodyWood + '\'' +
                ", color='" + color + '\'' +
                ", frets=" + frets +
                '}';
    }
}
