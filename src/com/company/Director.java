package com.company;

import java.util.Arrays;

public class Director extends Human {
    private static final String position = "Director";

    public Director(String name, String surname, Sex pol) {
        super(name, surname, pol);
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pol=" + pol + '\'' +
                ", position= " + Director.position +
                '}';
    }

    @Override
    public void doSomething() {
        System.out.println("Control Employee");
    }

    @Override
    public void TimeToSleep() {
        System.out.println("Sleeping Anytime");
    }
}
