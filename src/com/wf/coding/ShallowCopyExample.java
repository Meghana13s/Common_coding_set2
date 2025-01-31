package com.wf.coding;

class Persons implements Cloneable {
    String name;
    int age;
    Address address;

    public Persons(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // This only performs a shallow copy
    }
}

class Address {
    String city;
    String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }
}

public class ShallowCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York", "USA");
        Persons originalPerson = new Persons("John", 30, address);

        // Shallow copy (using clone)
        Persons shallowCopiedPerson = (Persons) originalPerson.clone();

        // Modify the address of the copied person
        shallowCopiedPerson.address.city = "Los Angeles";
        shallowCopiedPerson.name = "Meghu";

        System.out.println("Original Person Address: " + originalPerson.name);  // Output: John
        System.out.println("Shallow Copied Person Address: " + shallowCopiedPerson.name); // Output: Meghu

        System.out.println("Original Person Address: " + originalPerson.address.city);  // Output: Los Angeles
        System.out.println("Shallow Copied Person Address: " + shallowCopiedPerson.address.city);  // Output: Los Angeles
    }
}
