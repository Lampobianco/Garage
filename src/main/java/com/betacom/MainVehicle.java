package com.betacom;

import com.betacom.exceptions.AcademyException;
import com.betacom.process.*;
import com.betacom.services.Interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainVehicle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<Integer, Interfaces> m = new HashMap<Integer, Interfaces>();

        // Popoliamo la mappa prima della selezione
        m.put(1, new CarManager());
        m.put(2, new MotorbikeManager());
        m.put(3, new BikeManager());
        m.put(4, new CloseProgramManager());

        System.out.println("*** Begin Garage ***");
        System.out.println("1. Crea un'auto");
        System.out.println("2. Crea una moto");
        System.out.println("3. Crea una bici");
        System.out.println("4. Esci");

        System.out.print("-> ");

        String input = sc.nextLine();

        int selection;

        try {
            selection = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            selection = 0;
        }

        if (m.containsKey(selection)) {

            try {
                Interfaces i = m.get(selection);
                i.execute();
                System.out.println("*** Processo terminato normalmente *** ");
            } catch (Exception e) {
                System.err.println("*** Errore durante l'esecuzione: " + e.getMessage() + " ***");
            }

        } else {
            throw new AcademyException("Processo " + input + " non previsto !");
        }

        sc.close();
    }
}