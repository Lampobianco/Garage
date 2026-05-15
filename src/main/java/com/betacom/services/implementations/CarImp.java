package com.betacom.services.implementations;

import com.betacom.exceptions.AcademyException;
import com.betacom.models.Car;
import com.betacom.models.Vehicle;

public class CarImp implements VehicleImp{


    @Override
    public void wheelCountCheck(Vehicle v) throws AcademyException{
        if (v instanceof Car) {

            if (v.getWheelCount() != 4) {
                throw new AcademyException("Errore: Un veicolo di tipo Car deve avere esattamente 4 ruote!");
            }else{

                System.out.println("Numero di ruote corretto !");

            }
        }

    }

    @Override
    public void fuelTypeCheck(Vehicle v) throws AcademyException{

        if (v instanceof Car) {
            String fuel = v.getFuelType();

            // Se NON è benzina AND NON è elettrico AND...
            if (!(fuel.equals("benzina") || fuel.equals("elettrico") ||
                    fuel.equals("ibrida") || fuel.equals("diesel"))) {

                throw new AcademyException("Tipo alimentazione NON consentito: " + fuel);
            }else{

                System.out.println("Tipo alimentazione corretto !");

            }
        }

    }

    @Override
    public void categoryCheck(Vehicle v) throws AcademyException{

        if (v instanceof Car) {
            String cat = v.getCategory();

            if (cat == null || cat.isEmpty()) {
                throw new AcademyException("Errore: La categoria della macchina è mancante!");
            }

            String lowCat = cat.toLowerCase();

            if (!(lowCat.equals("suv") || lowCat.equals("fuoristrada") || lowCat.equals("utilitaria")
                    || lowCat.equals("berlina") || lowCat.equals("station wagon") || lowCat.equals("sportiva"))) {

                throw new AcademyException("Categoria '" + cat + "' non riconosciuta per il tipo Car.");
            }else{

                System.out.println("Tipo alimentazione corretto !");

            }
        }


    }

    @Override
    public void productionYearCheck(Vehicle v) throws AcademyException {

        int y = v.getProductionYear();

        if (y < 2006) {

            throw new AcademyException("Errore: L'anno di produzione (" + y + ") non può essere precedente al 2006!");
        }
        System.out.println("Anno di produzione corretto");
    }
}
