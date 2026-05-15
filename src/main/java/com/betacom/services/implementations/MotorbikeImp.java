package com.betacom.services.implementations;


import com.betacom.exceptions.AcademyException;
import com.betacom.models.Motorbike;
import com.betacom.models.Vehicle;
import com.betacom.singleton.SingleTon;

import java.util.Calendar;

public class MotorbikeImp implements VehicleImp{

    public MotorbikeImp() {

    }

    public void controllo(Vehicle v) {
        try{
            wheelCountCheck(v);
            categoryCheck(v);
            fuelTypeCheck(v);
            productionYearCheck(v);
            //checkTarga(v);
            SingleTon.getList().add(v);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /*public void checkTarga (Motorbike m) {
        for(Vehicle it:SingleTon.getList()) {
            if((it instanceof  Motorbike && it.getLicensePlate().)) {
                throw new AcademyException("moto: il veicolo "+m.getId()+ " ha una targa già esistente ("+v.getTarga()+")");
            }
        }
    }*/

    @Override
    public void wheelCountCheck(Vehicle v) throws AcademyException{
        if(!(v.getWheelCount()<2||v.getWheelCount()>3)) {
            throw new AcademyException("moto: il veicolo "+v.getId()+ " ha un numero sbagliato di ruote ("+v.getWheelCount()+")");
        }
    }

    @Override
    public void fuelTypeCheck(Vehicle v) throws AcademyException{
        if(!(v.getFuelType().equals("benzina")||v.getFuelType().equals("elettrica"))){
            throw new AcademyException("moto: il veicolo "+v.getId()+ " ha un alimentazione sbagliata ("+v.getFuelType()+")");
        }
    }

    @Override
    public void categoryCheck(Vehicle v) throws AcademyException{
        if(!(v.getCategory().equals("motocross")||v.getCategory().equals("strada"))){
            throw new AcademyException("moto: il veicolo "+v.getId()+ " è di tipo sbagliato ("+v.getCategory()+")");
        }
    }

    @Override
    public void productionYearCheck(Vehicle v) throws AcademyException{
        int annoCorrente = Calendar.getInstance().get(Calendar.YEAR);
        if(!(v.getProductionYear()>annoCorrente||v.getProductionYear()<(annoCorrente-20))) {
            throw new AcademyException("moto: il veicolo "+v.getId()+ " ha un anno di produzione sbagliato ("+v.getProductionYear()+")");
        }
    }
}
