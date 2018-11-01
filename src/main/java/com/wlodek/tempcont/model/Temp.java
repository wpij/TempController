package com.wlodek.tempcont.model;


public class Temp {

private String tempReading;

    public String getTempReading() {
        return tempReading;
    }

    public void setTempReading(String tempReading) {
        this.tempReading = tempReading;
    }

    public Temp(String tempReading) {
        this.tempReading = tempReading;
    }

    @Override
    public String toString() {
        return tempReading;
    }
}
