package com.betacom.models;

public class Bike extends Vehicle{

    private Integer gearCount;           // numeroMarce
    private String brakeType;            // tamburo, disco
    private String suspensionType;       // senza, mono, bi
    private Boolean foldable;            // pieghevole

    public Bike() {}

    public Bike(String vehicleType, Integer wheelCount, String fuelType, String category, String color, String brand, Integer productionYear, String model, Integer gearCount, String brakeType, String suspensionType, Boolean foldable) {
        super(vehicleType, wheelCount, fuelType, category, color, brand, productionYear, model);
        this.gearCount = gearCount;
        this.brakeType = brakeType;
        this.suspensionType = suspensionType;
        this.foldable = foldable;
    }

    public Integer getGearCount() {
        return gearCount;
    }

    public String getBrakeType() {
        return brakeType;
    }

    public String getSuspensionType() {
        return suspensionType;
    }

    public Boolean getFoldable() {
        return foldable;
    }


    public void setGearCount(Integer gearCount) {
        this.gearCount = gearCount;
    }

    public void setBrakeType(String brakeType) {
        this.brakeType = brakeType;
    }

    public void setSuspensionType(String suspensionType) {
        this.suspensionType = suspensionType;
    }

    public void setFoldable(Boolean foldable) {
        this.foldable = foldable;
    }
}
