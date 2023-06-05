package org.example.model;

import java.util.Objects;
import java.util.UUID;

public class Student extends Person {
    private String course;
    public UUID id;

    public Student(String name) {
        super(name);
        this.id = UUID.randomUUID();
    }

    public Student(String name, String course) {
        this(name);
        this.course = course;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String courseName) {
        this.course = courseName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course='" + course + '\'' +
                ", id=" + id +
                '}';
    }
}
