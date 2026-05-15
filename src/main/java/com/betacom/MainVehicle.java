package com.betacom;

import com.betacom.exeptions.AcademyExeption;
import com.betacom.services.Interfaces;
import com.betacom.singleton.VehicleManager;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainVehicle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Interfaces> m = new HashMap<String, Interfaces>();

        System.out.println("*** Begin Garage ***");
        System.out.println("Inserisci un valore : ");
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

            throw new AcademyExeption("Processo non previsto !");


        }


    }


}
