package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book apple = new Book("Здоровье", 65);
        Book bow = new Book("Ремесло", 75);
        Book axe = new Book("Лесничество", 51);
        Book clean = new Book("Clean Mode", 243);
        Book[] books = new Book[4];
        books[0] = apple;
        books[1] = bow;
        books[2] = axe;
        books[3] = clean;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getTitle() + " - " + book.getPages());
        }
        System.out.println("Change the apple code to a clean code.");
        books[0] = clean;
        books[3] = apple;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getTitle() + " - " + book.getPages());
        }
        System.out.println("Shown only book.title = Clean code");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getTitle().equals("Clean code")) {
                System.out.println(book.getTitle() + " - " + book.getPages());
            }
        }
    }
}
