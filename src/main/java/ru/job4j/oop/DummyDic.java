package ru.job4j.oop;

public class DummyDic {
    public String endToRus() {
        String eng = "dog";
        return eng;
    }

    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        String eng = word.endToRus();
        System.out.println("Собака " + eng);
    }
}
