package ru.job4j.cast;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println("Везу пассажиров");
    }

    @Override
    public void color() {
        System.out.println("Красный");
    }
}