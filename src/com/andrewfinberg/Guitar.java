package com.andrewfinberg;

/**
 * Super class for Guitars
 * Created by Andrew F 10/3/2019
 */
public abstract class Guitar {
    protected String make;
    protected String model;
    protected String bodyStyle;
    protected String bodyWood;
    protected String finishColor;
    protected int frets;
    protected double cost;

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
     */
    public Guitar(String make,
                  String model,
                  String bodyStyle,
                  String bodyWood,
                  String finishColor,
                  int frets,
                  double cost) {
        this.make = make;
        this.model = model;
        this.bodyStyle = bodyStyle;
        this.bodyWood = bodyWood;
        this.finishColor = finishColor;
        this.frets = frets;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public String getBodyWood() {
        return bodyWood;
    }

    public void setBodyWood(String bodyWood) {
        this.bodyWood = bodyWood;
    }

    public String getFinishColor() {
        return finishColor;
    }

    public void setFinishColor(String finishColor) {
        this.finishColor = finishColor;
    }

    public int getFrets() {
        return frets;
    }

    public void setFrets(int frets) {
        this.frets = frets;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", bodyStyle='" + bodyStyle + '\'' +
                ", bodyWood='" + bodyWood + '\'' +
                ", color='" + finishColor + '\'' +
                ", frets=" + frets +
                '}';
    }
}
