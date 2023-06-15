package org.example.model;

import java.util.UUID;

public class ComputerScienceStudent extends Student implements Citizen {
    private String specialization;
    private String OS;
    public ComputerScienceStudent(String name) {
        super(name, "Computer Science");
    }

    public ComputerScienceStudent(String name, String specialization) {
        super(name, "Computer Science");
        this.specialization = specialization;
    }

    public String getOS() {
        return this.OS;
    }

    public void setOS(String os) {
        this.OS = os;
    }

    public String getCourse() {
        return this.specialization;
    }

    @Override
    public void setCourse(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public UUID getIdentityCardNumber() {
        return this.getId();
    }
}
