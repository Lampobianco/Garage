package com.betacom.models;

public class Car extends Vehicle {

    private String licensePlate;
    private Integer doorCount;
    private Integer cc;

    public Car() {}

    public Car(String vehicleType, Integer wheelCount, String fuelType, String category, String color, String brand, Integer productionYear, String model, String licensePlate, Integer doorCount, Integer cc) {
        super(vehicleType, wheelCount, fuelType, category, color, brand, productionYear, model);
        this.licensePlate = licensePlate;
        this.doorCount = doorCount;
        this.cc = cc;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public Integer getDoorCount() {
        return doorCount;
    }

    public Integer getCc() {
        return cc;
    }


    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setDoorCount(Integer doorCount) {
        this.doorCount = doorCount;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }
}
