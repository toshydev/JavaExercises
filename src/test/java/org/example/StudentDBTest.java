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
    void addsStudent() {
        StudentDB oneStudentinDB = new StudentDB();
        oneStudentinDB.add(anton);
        Student[] oneStudent = {anton};
        assertArrayEquals(oneStudent, oneStudentinDB.getAllStudents());
    }

    @Test
    void removesStudent() {
        StudentDB oneStudentinDB = new StudentDB();
        oneStudentinDB.add(anton);
        oneStudentinDB.remove(anton);
        System.out.println(oneStudentinDB);
        Student[] noStudent = new Student[0];
        assertArrayEquals(noStudent, oneStudentinDB.getAllStudents());
    }

    @Test
    void yieldsAllStudents() {
        assertArrayEquals(students, studentDB.getAllStudents());
    }

    @Test
    void printsAllStudents() {
        assertEquals(Arrays.toString(students), Arrays.toString(studentDB.getAllStudents()));
    }
}