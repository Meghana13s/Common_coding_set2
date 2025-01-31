package com.wf.coding;

class Personss {
    String name;
    int age;
    Addresss address;

    public Personss(String name, int age, Addresss address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Deep copy constructor
    public Personss(Personss other) {
        this.name = other.name;
        this.age = other.age;
        this.address = new Addresss(other.address.city, other.address.country);  // Creating a new Address object
    }
}

class Addresss {
    String city;
    String country;

    public Addresss(String city, String country) {
        this.city = city;
        this.country = country;
    }
}

public class DeepCopyExample {
    public static void main(String[] args) {
        Addresss address = new Addresss("New York", "USA");
        Personss originalPerson = new Personss("John", 30, address);

        // Deep copy
        Personss deepCopiedPerson = new Personss(originalPerson);

        // Modify the address of the deep copied person
        deepCopiedPerson.address.city = "Los Angeles";

        System.out.println("Original Person Address: " + originalPerson.address.city);  // Output: New York
        System.out.println("Deep Copied Person Address: " + deepCopiedPerson.address.city);  // Output: Los Angeles
    }
}

