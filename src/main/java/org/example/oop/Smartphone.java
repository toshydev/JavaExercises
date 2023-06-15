package org.example.oop;

import java.util.Arrays;
import org.apache.commons.lang3.RandomStringUtils;
public class Smartphone implements Radio, GPS{
    private String modelName;
    private String manufacturer;
    private Contact[] contacts;

    public Smartphone() {

    }

    public Smartphone(String modelName, String manufacturer, Contact[] contacts) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.contacts = contacts;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public String getPosition() {
        return "Cologne";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    public String toString() {
        return this.modelName + "\n" + this.manufacturer + "\n" + Arrays.toString(this.getContacts());
    }

    public void addContact(Contact contactToAdd) {
        Contact[] newContacts = new Contact[contacts.length + 1];
        System.arraycopy(contacts, 0, newContacts, 0, contacts.length);
        newContacts[contacts.length] = contactToAdd;
        contacts = newContacts;
    }

    public Contact getContact(int index) {
        return this.getContacts()[index];
    }

    public String getContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact.toString();
            }
        }
        return "No such contact!";
    }

    public void removeContactByName(String name) {
        Contact[] newContacts = new Contact[contacts.length - 1];
        int idx = 0;
        while (idx < newContacts.length) {
            for (Contact contact : contacts) {
                if (!contact.getName().equals(name)) {
                    newContacts[idx] = contact;
                    idx++;
                }
            }
        }
        contacts = newContacts;
    }

    public static void main(String[] args) {
        Smartphone iphone = new Smartphone("iphone x", "apple", new Contact[0]);
        for (int i = 0; i < 15; i++) {
            String name = RandomStringUtils.randomAlphabetic(6);
            String number = RandomStringUtils.randomNumeric(10);
            iphone.addContact(new Friend(name, number));
        }
        System.out.println(Arrays.toString(iphone.getContacts()));
        iphone.addContact(new Friend("Gandalf", "0182938185"));
        System.out.println(iphone.getContactByName("Gandalf"));
        iphone.removeContactByName("Gandalf");
        System.out.println(iphone.getContactByName("Gandalf"));
    }
}
