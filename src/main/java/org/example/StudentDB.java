package org.example;

import org.example.model.Student;

import java.util.Arrays;
import java.util.Random;

public class StudentDB {
    private Student[] students;

    public StudentDB() {
        students = new Student[0];
    }

    public StudentDB(Student... studentArray) {
        this();
        for (Student student : studentArray) {
            this.add(student);
        }
    }

    public void add(Student studentToAdd) {
        Student[] newStudents = new Student[students.length + 1];
        System.arraycopy(students, 0, newStudents, 0, students.length);
        newStudents[students.length] = studentToAdd;
        students = newStudents;
    }

    public void remove(Student studentToRemove) {
        Student[] newStudents = new Student[students.length - 1];
        int idx = 0;
        while (idx < newStudents.length) {
            for (Student student : students) {
                if (!student.equals(studentToRemove)) {
                    newStudents[idx] = student;
                    idx++;
                }
            }
        }
        students = newStudents;
    }

    public Student[] getAllStudents() {
        return students;
    }

    public Student randomStudent() {
        Random rand = new Random();
        int randomIdx = rand.nextInt(students.length);
        return students[randomIdx];
    }

    /* Alternatively:
    public Student randomStudent() {
        double random = Math.random() * students.length;
        int randIdx = (int) random;
        return students[randIdx];
    }
     */

    @Override
    public String toString() {
        return Arrays.toString(students);
    }


    public static void main(String[] args) {
        Student anton = new Student("Anton", "Computer Science");
        Student josh = new Student("Josh", "Crypto");
        Student enrico = new Student("Enrico", "Game Development");
        Student sahed = new Student("Sahed", "Fintech");
        StudentDB newDB = new StudentDB(anton, josh, enrico, sahed);
        System.out.println(newDB);
        System.out.println("------------");
        newDB.remove(sahed);
        System.out.println(newDB);
    }
}
