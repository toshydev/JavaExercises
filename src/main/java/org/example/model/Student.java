package org.example.model;

import java.util.Objects;

public class Student {
    private int age;
    final String firstName;
    final String lastName;
    private String course;

    @Override
    public int hashCode() {
        return Objects.hash(age, firstName, lastName, course);
    }

    public Student(int age, String first, String last) {
        this.age = age;
        this.firstName = first;
        this.lastName = last;
    }

    public Student(int age, String first, String last, String course) {
        this.age = age;
        this.firstName = first;
        this.lastName = last;
        this.course = course;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return String.format("%s %s", this.firstName, this.lastName);
    }

    public String getCourse() {
        return this.course;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setCourse(String courseName) {
        this.course = courseName;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Student otherStudent = (Student) other;
        return (this.getAge() == otherStudent.getAge() && (this.getName().equals(otherStudent.getName())) && (this.getCourse().equals(otherStudent.getCourse())));
    }

    public String toString() {
        return String.format("Name: %s %s%nAge: %d%nCourse: %s", this.firstName, this.lastName, this.age, this.course);
    }

    public static void main(String[] args) {
        Student anton = new Student(33, "Anton", "Roters", "CS");
        Student clone = new Student(33, "Anton", "Roters", "CS");
        System.out.println(anton.equals(clone));
    }
}
