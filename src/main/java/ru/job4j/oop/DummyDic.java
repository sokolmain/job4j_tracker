package ru.job4j.oop;

public class DummyDic {
    public String endToRus(String eng) {
        return "Неизвестное слово " + eng;
    }

    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        String say = word.endToRus("Dog");
        System.out.println(say);
    }
}