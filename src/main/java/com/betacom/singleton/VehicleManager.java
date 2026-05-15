package com.betacom.singleton;

import com.betacom.models.Vehicle;
import com.betacom.services.Interfaces;

import java.util.HashMap;
import java.util.Map;

public class VehicleManager implements Interfaces {
    @Override
    public boolean execute() throws Exception {

        System.out.println("** Begin  Interface **");

        Map<Integer, Vehicle> veicles = new HashMap<Integer, Vehicle>();


        return false;
    }

    // CONTROLLI VEICOLI GENERALI
    // metodo privato controllo targa
    // metodo privato controllo anno di produzione
    // metodo privato controllo tipo veicolo con tipo alimentazione
    // metodo privato controllo numero ruote

    // CONTROLLI MOTO
    // metodo privato che controlla che la targa sia 2 lettere e 5 numeri e se sono uguali come bonus

    // CONTROLLI AUTO
    // metodo privato che controlla che la targa sia 2 lettere e 3 numeri e 2 lettere
    // metodo privato che controlla il numero delle porte, non inferiore a 3 a non superiore a 5

    // CONTROLLO BICI
    // metodo privato che controlla che le marce siano minimo 1 o massimo 24



}
