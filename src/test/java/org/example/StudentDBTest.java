package org.example;

import org.example.exceptions.StudentException;
import org.example.model.ComputerScienceStudent;
import org.example.model.Student;
import org.junit.jupiter.api.Test;

import java.security.KeyException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {
    Student anton = new ComputerScienceStudent("Anton", "Cybersecurity");
    Student josh = new ComputerScienceStudent("Josh", "Cryptography");
    Student enrico = new ComputerScienceStudent("Enrico", "Game Development");
    Student sahed = new ComputerScienceStudent("Sahed", "Fintech");
    List<Student> students = new ArrayList<>(List.of(
            anton, sahed, josh, enrico
    ));
    StudentDB studentDB = new StudentDB(students);

    @Test
    void expectNotFoundException_whenCalledWithNonexistentId() {
        studentDB.add(sahed);
        assertThrowsExactly(StudentException.class, () -> studentDB.findById("abcdefg"));
    }

    @Test
    void addsStudent() {
        StudentDB oneStudentinDB = new StudentDB();
        oneStudentinDB.add(anton);
        List<Student> oneStudent = new ArrayList<>();
        oneStudent.add(anton);
        assertEquals(oneStudent, oneStudentinDB.getAllStudents());
    }

    @Test
    void removesStudent() {
        StudentDB oneStudentinDB = new StudentDB();
        oneStudentinDB.add(anton);
        oneStudentinDB.remove(anton);
        List<Student> noStudent = new ArrayList<>();
        assertEquals(noStudent, oneStudentinDB.getAllStudents());
    }

    @Test
    void yieldsAllStudents() {
        assertEquals(students, studentDB.getAllStudents());
    }

    @Test
    void printsAllStudents() {
        assertEquals(students.toString(), studentDB.getAllStudents().toString());
    }
}