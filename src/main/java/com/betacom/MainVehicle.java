package com.betacom;

import com.betacom.exceptions.AcademyException;
import com.betacom.services.Interfaces;
import com.betacom.process.VehicleManager;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainVehicle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Interfaces> m = new HashMap<String, Interfaces>();

        System.out.println("*** Begin Garage ***");
        System.out.println("1. Crea un'auto");
        System.out.println("2. Crea una moto");
        System.out.println("3. Crea una bici");
        System.out.println("4. Esci");
        System.out.println("->");
        String selection = sc.nextLine();

        m.put("garage", new VehicleManager());

        if(m.containsKey(selection)){

            try{

                Interfaces i = m.get(selection);
                i.execute();
                System.out.println("*** Processo terminato normalmente *** ");

            }catch (Exception e){

                System.err.println("*** Errore durante l'esecuzione *** ");

            }

        }else {

            throw new AcademyException("Processo non previsto !");


        }


    }


}
