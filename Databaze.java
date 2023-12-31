package org.example;

import java.util.ArrayList;


public class Databaze {

    public static Object nalezene;
    private ArrayList<Zaznam> zaznamy;

    public Databaze() {
        zaznamy = new ArrayList<>();
    }

    public void pridejZaznam(String name, String surName, int number, int age) {
        zaznamy.add(new Zaznam(name, surName, number, age));
    }

    public ArrayList<Zaznam> vyhledejZaznamy(String name, String b, Object surName) {
        ArrayList<Zaznam> nalezene = new ArrayList<>();
        for (Zaznam zaznam : zaznamy)
            nalezene.add(zaznam);

        return nalezene;
    }

    public ArrayList<Zaznam> vypsatZaznamy() {
        ArrayList<Zaznam> nalezene = new ArrayList<>();
        for (Zaznam zaznam : zaznamy)
            nalezene.add(zaznam);

        return nalezene;
    }
}
