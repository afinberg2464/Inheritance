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

    /**
     * Default constructor
     *
     * @param make
     * @param model
     * @param bodyStyle
     * @param bodyWood
     * @param finishColor
     * @param frets
     */
    public Guitar(String make, String model, String bodyStyle, String bodyWood, String finishColor, int frets) {
        this.make = make;
        this.model = model;
        this.bodyStyle = bodyStyle;
        this.bodyWood = bodyWood;
        this.finishColor = finishColor;
        this.frets = frets;
    }

    /**
     * Returns make (manufacturer)
     *
     * @return make
     */
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Returns model
     *
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Returns body style
     *
     * @return body style
     */
    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    /**
     * Returns body wood
     *
     * @return body wood
     */
    public String getBodyWood() {
        return bodyWood;
    }

    public void setBodyWood(String bodyWood) {
        this.bodyWood = bodyWood;
    }

    /**
     * Returns color
     *
     * @return color
     */
    public String getFinishColor() {
        return finishColor;
    }

    public void setFinishColor(String finishColor) {
        this.finishColor = finishColor;
    }

    /**
     * Returns number of frets
     *
     * @return frets
     */
    public int getFrets() {
        return frets;
    }

    public void setFrets(int frets) {
        this.frets = frets;
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
