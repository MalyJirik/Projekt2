package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Seznam {
    private Databaze databaze;
    private Scanner scanner = new Scanner(System.in, "utf-8");

    private Zaznam[] zaznamy;


    public Seznam() {
        this.zaznamy = zaznamy;
        databaze = new Databaze();
    }

    public static void vypisUvodniObrazovku() {

    }

    public void pridejPojistence() {
        System.out.println("Zadejte jméno pojištěného:");
        String name = scanner.nextLine();

        System.out.println("Zadejte příjmení:");
        String surName = scanner.nextLine();

        System.out.println("Zadejte telefonní číslo:");
        int number = parseInt(scanner.nextLine());

        System.out.println("Zadejte věk:");
        int age = parseInt(scanner.nextLine());

        databaze.pridejZaznam(name, surName, number, age);
    }

    public void vyhledejPojistence() {
        System.out.println("Zadejte jméno pojištěného: ");
        String name = scanner.nextLine();
        System.out.println("Zadejte příjmení pojištěného: ");
        String surName = scanner.nextLine();

        ArrayList<Zaznam> zaznamy = databaze.vyhledejZaznamy(name, surName, false);

        if (!zaznamy.isEmpty()) {
            System.out.println("Nalezeny tyto záznamy: ");
            for (Zaznam zaznam : zaznamy) {
                System.out.println(zaznam);
            }
        } else {
            System.out.println("Nebyly nalezeny žádné záznamy.");
        }
    }
    public void vypsatPojistence() {
        ArrayList<Zaznam> zaznamy = databaze.vypsatZaznamy();
        for (Zaznam zaznam : zaznamy) {
            System.out.println(zaznam);
        }




    }





}

