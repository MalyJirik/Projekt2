package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "utf-8");
        Seznam seznam = new Seznam();
        String volba = "";

        while (!volba.equals("4")) {
            Seznam.vypisUvodniObrazovku();
            System.out.println();
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
            volba = scanner.nextLine();
            System.out.println();

            switch (volba) {
                case "1":
                    seznam.pridejPojistence();
                    break;
                case "2":
                    seznam.vypsatPojistence();
                    break;
                case "3":
                    seznam.vyhledejPojistence();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");
                    break;
            }
        }
    }
}
