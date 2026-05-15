package com.betacom.process;

import com.betacom.models.Motorbike;
import com.betacom.models.Vehicle;
import com.betacom.services.Interfaces;
import com.betacom.services.implementations.MotorbikeImp;

public class MotorbikeManager implements Interfaces {
    @Override
    public boolean execute() throws Exception {

        Vehicle moto = new Motorbike();
        MotorbikeImp controllo = new MotorbikeImp();

        controllo.controllo(moto);


        return false;
    }
}
