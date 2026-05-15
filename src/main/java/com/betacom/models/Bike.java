package com.betacom.models;

public class Bike extends Vehicle{

    private Integer gearCount;           // numeroMarce
    private String brakeType;            // tamburo, disco
    private String suspensionType;       // senza, mono, bi
    private Boolean foldable;            // pieghevole

    public Bike() {}

    public Bike(Integer gearCount, String brakeType, String suspensionType, Boolean foldable) {
        super();
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
