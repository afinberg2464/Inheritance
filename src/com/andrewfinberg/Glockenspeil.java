package com.andrewfinberg;

public class Glockenspeil extends Percussion {
    private String beaterType; // wood, felt

    public Glockenspeil(String section, boolean tuned, String beaterType) {
        super(section, tuned);
        this.beaterType = beaterType;
    }

    public String getBeaterType() {
        return beaterType;
    }

    public void setBeaterType(String beaterType) {
        this.beaterType = beaterType;
    }

    public String play() {
        return "Ding dong";
    }

    @Override
    public String toString() {
        return "Glockenspeil{" +
                "beaterType='" + beaterType + '\'' +
                '}';
    }
}
