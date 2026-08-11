package ru.job4j.output;

public class StubOutput implements Output {
    private final StringBuilder buffer = new StringBuilder();

    @Override
    public void println(String output) {
        buffer.append(output);
        buffer.append(System.lineSeparator());
    }

    @Override
    public String toString() {
        return buffer.toString();
    }
}