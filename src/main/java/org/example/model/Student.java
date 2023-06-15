package org.example.model;

import java.util.UUID;

public abstract class Student extends Person {
    private String course;
    private UUID id;

    public Student(String name) {
        super(name);
        this.id = UUID.randomUUID();
    }

    public Student(String name, String course) {
        this(name);
        this.course = course;
    }

    public UUID getId() {
        return this.id;
    }

    public abstract String getCourse();

    public void setCourse(String courseName) {
        this.course = courseName;
    }

    @Override
    public String toString() {
        return "Student{" + this.getName() +
                ", course='" + course + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        Student kohei = new ComputerScienceStudent("Kohei", "Game Development");
        System.out.println(kohei);
    }
}
