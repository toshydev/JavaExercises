package org.example.model;

import java.util.Objects;
import java.util.UUID;

public class Student {
    final String name;
    private String course;
    public UUID id;

    public Student(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
    }

    public Student(String name, String course) {
        this(name);
        this.course = course;
    }

    public String getName() {
        return this.name;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String courseName) {
        this.course = courseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(course, student.course) && Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course, id);
    }

    public String toString() {
        return String.format("Name: %s%nCourse: %s", this.name, this.course);
    }

    public static void main(String[] args) {
    }
}
