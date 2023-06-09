package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    public Student testStudent = new BiologyStudent("Monty", "Spam");

    @Test
    void getName() {
        assertEquals("Monty", testStudent.getName());
    }

    @Test
    void getCourse() {
        assertEquals("Spam", testStudent.getCourse());
    }


    @Test
    void setCourse() {
        testStudent.setCourse("Bacon");
        assertEquals("Bacon", testStudent.getCourse());
    }

    @Test
    void testEquals() {
        Student newStudent = new BiologyStudent("Monty", "Spam");
        assertNotEquals(testStudent, newStudent);
    }
}