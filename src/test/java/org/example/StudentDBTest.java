package org.example;

import org.example.model.Student;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {
    Student anton = new Student("Anton", "Computer Science");
    Student josh = new Student("Josh", "Crypto");
    Student enrico = new Student("Enrico", "Game Development");
    Student sahed = new Student("Sahed", "Fintech");
    Student[] students = {anton, josh, enrico, sahed};
    StudentDB studentDB = new StudentDB(students);
    @Test
    void yieldsAllStudents() {
        assertArrayEquals(students, studentDB.getAllStudents());
    }

    @Test
    void printsAllStudents() {
        assertEquals(Arrays.toString(students), Arrays.toString(studentDB.getAllStudents()));
    }
}