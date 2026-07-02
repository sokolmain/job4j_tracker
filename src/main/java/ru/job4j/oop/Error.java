package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public void printInfo() {
        System.out.println("Error " + active);
        System.out.println("Status " + status);
        System.out.println("Message " + message);
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error cpu = new Error(false, 0, "процессор исправен!");
        cpu.printInfo();
        Error gpu = new Error(true, 1, "повреждение видеочипа!");
        gpu.printInfo();
        Error defalterror = new Error();
        defalterror.printInfo();
    }
}
