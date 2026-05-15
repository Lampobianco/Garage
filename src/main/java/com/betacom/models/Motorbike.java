package com.betacom.models;

public class Motorbike extends Vehicle{

    private String licensePlate;   // deve essere univoca
    private Integer cc;


    public Motorbike() {}

    public Motorbike(String licensePlate, Integer cc) {
        super();
        this.licensePlate = licensePlate;
        this.cc = cc;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public Integer getCc() {
        return cc;
    }


    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }
}
