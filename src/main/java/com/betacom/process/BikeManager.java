package com.betacom.process;

import com.betacom.models.Bike;
import com.betacom.services.Interfaces;
import com.betacom.services.implementations.BikeImp;

public class BikeManager implements Interfaces {
    @Override
    public boolean execute() throws Exception {

        Bike bici = new Bike();

        BikeImp test = new BikeImp();

        test.controllo(bici);

        return false;
    }
}
