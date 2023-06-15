package org.example.model;

import java.util.UUID;

public class BiologyStudent extends Student implements Citizen {
    private String biotope;

    public BiologyStudent(String name) {
        super(name, "Biology");
    }
    public BiologyStudent(String name, String biotope) {
        super(name, "Biology");
        this.biotope = biotope;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public UUID getIdentityCardNumber() {
        return this.getId();
    }

    @Override
    public String getCourse() {
        return this.biotope;
    }
}
