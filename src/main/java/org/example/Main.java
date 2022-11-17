package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        DatabazePojistencu DatabazePojistencu = new DatabazePojistencu();

//úvodní info
        System.out.println("Evidence pojištěných");
        System.out.println("------------------------");
        System.out.println("  ");

//výpis možností
        String volba = " ";
        while (!(volba.equals("4")))
        {
            System.out.println("Vyberte si akci: ");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsání všech pojištěnců");
            System.out.println("3 - Vybrat pojištěného");
            System.out.println("4 - Konec ");
            volba = sc.nextLine().trim();
            System.out.println();

//vypsání vybrané možnosti
            switch (volba){
                case "1":
                    System.out.println("Zadej jméno pojištěného: ");
                    String jmeno = sc.nextLine();
                    System.out.println("Zadej příjmení pojištěného: ");
                    String prijmeni = sc.nextLine();
                    System.out.println("Zadej telefonní číslo pojištěného: ");
                    int telefonniCislo = Integer.parseInt(sc.nextLine());
                    System.out.println("Zadej věk pojištěného: ");
                    int vek = Integer.parseInt(sc.nextLine());
                    DatabazePojistencu.pridejPojistence(jmeno, prijmeni, vek, telefonniCislo);
                    break;
                case "2":
                    ArrayList<Pojistenec> vsichniPojistenci  = DatabazePojistencu.vsichniPojistenci();
                    for( Pojistenec pojistenec : vsichniPojistenci){
                        System.out.println(pojistenec);
                    }
                    break;
                case "3":
                    System.out.println("Zadej jméno hledaného pojištěnce: ");
                    String jmeno2 = sc.nextLine();
                    System.out.println("Zadej příjmení hledaného pojištěnce: ");
                    String prijmeni2 = sc.nextLine();
                    ArrayList<Pojistenec> vybranaOsoba = DatabazePojistencu.najdiPojistence(jmeno2, prijmeni2);
                    for(Pojistenec osoba: vybranaOsoba){
                        System.out.println(osoba);
                    }
                    break;
                case "4":
                    System.out.println("Libovolnou klávesou ukončíte program.");
                    break;
                default:
                    System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");
                    break;
            }
        }

    }
}

