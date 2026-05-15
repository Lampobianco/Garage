package com.betacom.models;

public abstract class Vehicle {

    private Integer id;                // id univoco del record
    private String vehicleType;        // macchina, moto, bici
    private Integer wheelCount;        // dipende del tipo veicolo
    private String fuelType;           // benzina, diesel, elettrica, hybrid, manual
    private String category;           // strada, fuoristrada, suv, motocross... // dipende del tipo veicolo
    private String color;
    private String brand;
    private Integer productionYear;
    private String model;

    public Vehicle(){}

    public Vehicle(Integer id, String vehicleType, Integer wheelCount, String fuelType, String category, String color, String brand, Integer productionYear, String model) {
        this.id = id++;
        this.vehicleType = vehicleType;
        this.wheelCount = wheelCount;
        this.fuelType = fuelType;
        this.category = category;
        this.color = color;
        this.brand = brand;
        this.productionYear = productionYear;
        this.model = model;
    }

    public Integer getId() {
        return id;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public Integer getWheelCount() {
        return wheelCount;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getCategory() {
        return category;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getModel() {
        return model;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setWheelCount(Integer wheelCount) {
        this.wheelCount = wheelCount;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static void licensePlateCheck(String s) {

        // if che controlla se i caratteri sono 7
        // se sono 7 controlla che siano 2 lettere 5 num e 2 lettere
        // se è corretta stampare "Targa inserita correttamente"
        // altrimenti stampare "Reinserisci targa"

    }

    public static void productionYearCheck(Integer y) {
        // if che controlla se la data non è minore del 2006
        // se corretto allora stampa "Anno inserito correttamente"
        // altrimenti "Reinserisci anno di produzione"
    }

    public static void modelTypeCheck(String m, String t) {
        // if che controlla dato un certo modello di macchina con una tipologia adeguata
        // se corretto allora stampa "Anno inserito correttamente"
        // altrimenti "Reinserisci anno di produzione"
    }

    public static void numRuoteCheck(Integer nr, String t) {
        // if che controlla se le ruote sono adeguate al tipo di veicolo
        // se corretto allora stampa "Anno inserito correttamente"
        // altrimenti "Reinserisci anno di produzione"

    }


}
