package org.example.oop;

public class BusinessContact extends Contact {
    private String companyName;

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String toString() {
        return this.getName() + "\n" + this.getCompanyName();
    }
}
