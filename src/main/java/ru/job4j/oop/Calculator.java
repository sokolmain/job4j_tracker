package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int k) {
        return k - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int z) {
        return z / x;
    }

    public int sumAllOperation(int c) {
        return sum(c) + minus(c) + divide(c) + multiply(c);
    }

    public static void main(String[] args) {
        int resultOne = sum(10);
        System.out.println(resultOne);

        int resultTwo = minus(15);
        System.out.println(resultTwo);

        Calculator calculator = new Calculator();
        int result = calculator.multiply(5);
        System.out.println(result);

        int result2 = calculator.divide(15);
        System.out.println(result2);

        int result3 = calculator.sumAllOperation(3);
        System.out.println(result3);
    }
}