package ms.subtex;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person>{

    String name;

    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public int compareTo(Person o) {
//        return this.name.compareTo(o.name); // default sorting - ascendogn
//    }

    @Override
    public int compareTo(Person o) { // since compareTo works with object datatype i.e Integer
//        return Integer.compare(this.age,o.age); // default sorting - asecending
        return Integer.compare(o.age,this.age); // descending
    }
}

public class ComparableExample {

    public static void main(String[] args) {
        List<Person> al = Arrays.asList(
                new Person("meghana",25),
                new Person("sinchu",18),
                new Person("micky",38),
                new Person("abhi",50)
        );

        Collections.sort(al);
        System.out.println(al);




    }
}
