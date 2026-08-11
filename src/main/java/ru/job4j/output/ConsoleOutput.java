package ru.job4j.output;

public class ConsoleOutput implements Output {
    @Override
    public void println(String output) {
        System.out.println(output);
    }
}