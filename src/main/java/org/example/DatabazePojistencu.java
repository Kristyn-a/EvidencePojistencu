package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class DatabazePojistencu {
    //Pojistenec pojistenec = new Pojistenec();
    Scanner sc = new Scanner (System.in);
    private ArrayList<Pojistenec> pojistenci; //všichni pojitěnci

    public DatabazePojistencu(){
        pojistenci = new ArrayList<>();
    }

    //přidání pojištěnce (nové osoby)
    public void pridejPojistence (String jmeno, String prijmeni, int vek, int telefonniCislo){
        pojistenci.add(new Pojistenec(jmeno, prijmeni, vek, telefonniCislo));
    }

    //vyhledání pojištěnce podle jména nebo příjmení
    public ArrayList<Pojistenec>najdiPojistence(String jmeno, String prijmeni){
        ArrayList<Pojistenec> nalezen = new ArrayList<>();
        for(Pojistenec x : pojistenci){
            if(x.getJmeno().contains(jmeno)&&(x.getPrijmeni().contains(prijmeni))){
                nalezen.add(x);
            }
        }
        return nalezen;
    }
    //vyhledání a vrácení všech pojištěnců
    public ArrayList<Pojistenec>vsichniPojistenci(){
        return pojistenci;
    }
}

