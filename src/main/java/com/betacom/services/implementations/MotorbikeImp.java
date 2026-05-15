package com.betacom.services.implementations;


import com.betacom.exceptions.AcademyException;
import com.betacom.models.Vehicle;
import com.betacom.singleton.SingleTon;

public class MotorbikeImp implements VehicleImp{

    private MotorbikeImp() {

    }

    public void controllo(Vehicle v) {
        try{
            wheelCountCheck(v);
            categoryCheck(v);
            fuelTypeCheck(v);
            checkTarga(v);
            SingleTon.getList().add(v);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void checkTarga (Vehicle v) {
        for(Vehicle it:SingleTon.getList()) {
            if(v.getTarga().equals(it.getTarga())) {
                throw new AcademyException("moto: il veicolo "+v.getId()+ " ha una targa già esistente ("+v.getTarga()+")");
            }
        }
    }

    @Override
    public void wheelCountCheck(Vehicle v) throws AcademyException{
        if(v.getWheelCount()<2||v.getWheelCount()>3) {
            throw new AcademyException("moto: il veicolo "+v.getId()+ " ha un numero sbagliato di ruote ("+v.getWheelCount()+")");
        }
    }

    @Override
    public void fuelTypeCheck(Vehicle v) throws AcademyException{
        if(v.getFuelType().equals("benzina")||v.getFuelType().equals("elettrica")){
            throw new AcademyException("moto: il veicolo "+v.getId()+ " ha un alimentazione sbagliata ("+v.getFuelType()+")");
        }
    }

    @Override
    public void categoryCheck(Vehicle v) throws AcademyException{
        if(v.getCategory().equals("motocross")||v.getCategory().equals("strada")){
            throw new AcademyException("moto: il veicolo "+v.getId()+ " è di tipo sbagliato ("+v.getCategory()+")");
        }
    }

    @Override
    public void productionYearCheck(Vehicle v) throws AcademyException{
        if(v.getProductionYear()>2026||v.getProductionYear()<2006) {
            throw new AcademyException("moto: il veicolo "+v.getId()+ " ha un anno di produzione sbagliato ("+v.getProductionYear()+")");
        }
    }
}
