package org.example;

import java.util.Scanner;

public class Zaznam {

    private String name;
    private String surName;
    private int number;
    private int age;
    private Scanner scanner = new Scanner(System.in, "utf-8");

    public Zaznam(String name, String surName, int number, int age) {
        this.name = name;
        this.surName = surName;
        this.number = number;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getNumber() {
        return number;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return (getName() + " " + getSurName() + " " + getNumber() + " " + getAge());
    }

    
    
}

