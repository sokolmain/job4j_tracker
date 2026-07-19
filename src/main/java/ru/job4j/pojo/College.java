package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Виктор Соколов");
        student.setGroup("Java");
        student.admissionDate(2026, 7, 1);

        System.out.println(student.getName() + " поступил в группу по " + student.getGroup()
        + " в " + student.getCreated());
    }
}
