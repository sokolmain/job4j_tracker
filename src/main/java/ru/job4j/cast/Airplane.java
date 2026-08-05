package ru.job4j.cast;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Летаю");
    }

    @Override
    public void color() {
        System.out.println("Синий");
    }
}