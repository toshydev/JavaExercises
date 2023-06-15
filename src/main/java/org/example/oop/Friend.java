package org.example.oop;

public class Friend extends Contact {
    private String number;

    public Friend() {
        super();
    }

    public Friend(String name, String tel) {
        super.name = name;
        this.number = tel;
    }

    public String toString() {
        return this.getName() + "\n" + this.number;
    }
}
