package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String name;
    private String group;
    private LocalDate admissionDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDate getCreated() {
        return admissionDate;
    }

    public void admissionDate(int year, int month, int dayOfMonth) {
        this.admissionDate = LocalDate.of(year, month, dayOfMonth);
    }
}
