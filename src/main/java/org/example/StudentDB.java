package org.example;

import org.example.exceptions.StudentException;
import org.example.model.ComputerScienceStudent;
import org.example.model.Student;

import java.util.*;

public class StudentDB {
    private HashMap<String, Student> students;

    public StudentDB() {
        students = new HashMap<>();
    }

    public StudentDB(List<Student> studentList) {
        this();
        for (Student student : studentList) {
            this.add(student);
        }
    }

    public void add(Student studentToAdd) {
        students.put(studentToAdd.getId().toString(), studentToAdd);
    }

    public void remove(Student studentToRemove) {
        students.remove(studentToRemove.getName());
    }

    public ArrayList<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Student randomStudent() {
        Random rand = new Random();
        int randomIdx = rand.nextInt(students.size());
        return (Student) students.values().toArray()[randomIdx];
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }

    public Student findById(String id) {
        if (!students.containsKey(id)) {
            throw new StudentException();
        }
        return students.get(id);
    }
}
