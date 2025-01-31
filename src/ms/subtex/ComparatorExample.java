package ms.subtex;

//Sort by name length: Sort people based on the length of their name, from shortest to longest.
//Sort by city name: Sort people alphabetically by their city name.


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Persons{
    String name;
    String city;
    int age;

    public Persons(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }




}
public class ComparatorExample {

    public static void main(String[] args) {
        List<Persons> peoplee = Arrays.asList(
                new Persons("John", "New York", 25),
                new Persons("Alice", "Los Angeles", 30),
                new Persons("zob", "Chicago", 20),
                new Persons("Sarah", "San Francisco", 28),
                new Persons("Max", "Houston", 22)
        );

        Collections.sort(peoplee, new Comparator<Persons>() {
            @Override
            public int compare(Persons o1, Persons o2) {
                return Integer.compare(o1.name.length(),o2.name.length());
            }
        });

        System.out.println(peoplee);

    }
}
