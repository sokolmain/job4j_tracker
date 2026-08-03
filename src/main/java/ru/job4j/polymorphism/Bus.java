package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Bus move");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Passengers: " + count);
    }

    @Override
    public int refuel(int fuel) {
        System.out.println("Fuel left " + fuel);
        return fuel;
    }
}
