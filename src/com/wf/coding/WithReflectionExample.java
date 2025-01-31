package com.wf.coding;

import java.lang.reflect.Method;

class Person {
    public void greet() {
        System.out.println("Hello from Person");
    }
}

class Dog {
    public void greet() {
        System.out.println("Hello from Dog");
    }
}

public class WithReflectionExample {
    public static void main(String[] args) {
        Object obj = new Person(); // This could be any object (could also be a Dog)

        try {
            // Get the class of the object dynamically
            Class<?> objClass = obj.getClass();

            // Get the greet method dynamically from the class
            Method greetMethod = objClass.getMethod("greet");

            // Invoke the greet method on the object
            greetMethod.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}