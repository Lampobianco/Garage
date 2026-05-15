package com.betacom.singleton;

import com.betacom.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class SingleTon {    //per gestire l'accesso alla lista

    private static SingleTon istance=null;
    private static List <Vehicle> veicoli = null;

    private SingleTon() {



    }

    private static SingleTon getInstance() {   //creazione singleton se non esiste
        if(istance == null) {
            istance=new SingleTon();
        }

        return istance;
    }

    public static List <Vehicle> getList() { //crea lista se non esiste, la sostituisce sempre
        if(getInstance().veicoli == null) {
            veicoli = new ArrayList <Vehicle> ();

        }

        return veicoli;
    }   //per operare sulla lista bisogna chiamare SingleTon.getList() e aggiungere metodi tipo .add() ecc


}
