package com.betacom.process;

import com.betacom.models.Car;
import com.betacom.models.Vehicle;
import com.betacom.services.Interfaces;
import com.betacom.services.implementations.CarImp;

public class CarManager implements Interfaces {
    @Override
    public boolean execute() throws Exception {


        Vehicle car = new Car();
        car.setWheelCount(4);
        car.setFuelType("benzina");
        car.setCategory("fuoristrada");
        car.setProductionYear(2018);

        CarImp ci1 = new CarImp();
        ci1.wheelCountCheck(car);
        ci1.fuelTypeCheck(car);
        ci1.categoryCheck(car);
        ci1.productionYearCheck(car);


        return false;
    }
}
