package com.betacom.models;

public class Motorbike extends Vehicle{

    private String licensePlate;   // deve essere univoca
    private Integer cc;


    public Motorbike() {}

    public Motorbike(String vehicleType, Integer wheelCount, String fuelType, String category, String color, String brand, Integer productionYear, String model, String licensePlate,Integer cc) {
        super(vehicleType, wheelCount, fuelType, category, color, brand, productionYear, model);
        this.licensePlate = licensePlate;
        this.cc=cc;
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
