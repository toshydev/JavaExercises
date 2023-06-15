package org.example.model;

public class ComputerScienceStudentFirstYear extends ComputerScienceStudent {
    public int year = 1;
    public ComputerScienceStudentFirstYear(String name) {
        super(name);
    }
    public ComputerScienceStudentFirstYear(String name, String specialization) {
        super(name, specialization);
    }

    public static void main(String[] args) {
        ComputerScienceStudentFirstYear anton = new ComputerScienceStudentFirstYear("Anton");
        anton.setCourse("System Architecture");
        System.out.println(anton.getCourse());
    }
}
