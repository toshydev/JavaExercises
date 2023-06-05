package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    public Student testStudent = new Student(42, "Monty", "Python", "Spam");

    @Test
    void getAge() {
        assertEquals(42, testStudent.getAge());
    }

    @Test
    void getName() {
        assertEquals("Monty Python", testStudent.getName());
    }

    @Test
    void getCourse() {
        assertEquals("Spam", testStudent.getCourse());
    }

    @Test
    void setAge() {
        testStudent.setAge(111);
        assertEquals(111, testStudent.getAge());
    }

    @Test
    void setCourse() {
        testStudent.setCourse("Bacon");
        assertEquals("Bacon", testStudent.getCourse());
    }

    @Test
    void testEquals() {
        Student newStudent = new Student(42, "Monty", "Python", "Spam");
        assertTrue(testStudent.equals(newStudent));
    }
}