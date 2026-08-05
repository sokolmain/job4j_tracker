package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Еду по рельсам");
    }

    @Override
    public void color() {
        System.out.println("Зеленый");
    }
}