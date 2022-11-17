package org.example;

public class Pojistenec {
    //definice pojištěnce, co vše má obsahovat
    private String jmeno;
    private String prijmeni;
    private int vek;
    private int telefonniCislo;

    //vytvořený konstruktor pro pojištěnce
    public Pojistenec(String jmeno, String prijmeni, int vek, int telefonniCislo){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }

    //vrácení jména pojištěnce
    public String getJmeno(){
        return jmeno;
    }

    //vrácení příjmení pojištěnce
    public String getPrijmeni(){
        return prijmeni;
    }
    //pro vypsání uživatele
    @Override
    public String toString(){
        return jmeno + " " + prijmeni + " " + vek + " " + telefonniCislo;
    }

}

