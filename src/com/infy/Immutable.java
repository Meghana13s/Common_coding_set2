package com.infy;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class Immutable {

    private final String name;
    private final List<String> phoneNumbers;
    private final Date birthDate;

    public Immutable(String name, List<String> phoneNumbers, Date birthDate) {
        this.name = name;
        this.phoneNumbers = Collections.unmodifiableList(phoneNumbers);
        this.birthDate = new Date(birthDate.getTime());
    }

    public String getName() {
        return name;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public Date getBirthDate() {
        return new Date(birthDate.getTime());
    }

    @Override
    public String toString() {
        return "Immutable{" +
                "name='" + name + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", birthDate=" + birthDate +
                '}';
    }

    public static void main(String[] args) {

        List<String> phones = List.of("123-456-7890", "987-654-3210");
        Date birthDate = new Date(1990, 1, 1);

        Immutable person = new Immutable("John Doe", phones, birthDate);
        System.out.println(person);

        phones.add("555-555-5555"); // This will not affect the person object as phoneNumbers is immutable
//        birthDate.setYear(1985); // This will not affect the person's birthDate

        // Print the person details again
        System.out.println(person);

    }
}
