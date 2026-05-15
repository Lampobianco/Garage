package com.betacom.services.implementations;

import com.betacom.models.Vehicle;
import com.betacom.models.Motorbike;

public interface VehicleImp {

    void wheelCountCheck(Vehicle v);
    void fuelTypeCheck(Vehicle v);
    void categoryCheck(Vehicle v);
    void productionYearCheck(Vehicle v);

}
