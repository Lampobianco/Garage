package com.betacom.services.implementations;

import com.betacom.exceptions.AcademyException;
import com.betacom.models.Vehicle;
import com.betacom.singleton.SingleTon;

import java.util.Calendar;

public class BikeImp  implements VehicleImp{
    public void controllo(Vehicle v) {
        try{
            wheelCountCheck(v);
            categoryCheck(v);
            fuelTypeCheck(v);
            productionYearCheck(v);
            SingleTon.getList().add(v);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void wheelCountCheck(Vehicle v) throws AcademyException {
        if(v.getWheelCount()<1||v.getWheelCount()>2) {
            throw new AcademyException("bici: il veicolo "+v.getId()+ " ha un numero sbagliato di ruote ("+v.getWheelCount()+")");
        }
    }

    @Override
    public void fuelTypeCheck(Vehicle v) throws AcademyException{
        if(v.getFuelType().equals("manuale")||v.getFuelType().equals("elettrica")){
            throw new AcademyException("bici: il veicolo "+v.getId()+ " ha un alimentazione sbagliata ("+v.getFuelType()+")");
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
        int annoCorrente = Calendar.getInstance().get(Calendar.YEAR);
        if(v.getProductionYear()>annoCorrente||v.getProductionYear()<(annoCorrente-20)) {
            throw new AcademyException("bici: il veicolo "+v.getId()+ " ha un anno di produzione sbagliato ("+v.getProductionYear()+")");
        }
    }
}