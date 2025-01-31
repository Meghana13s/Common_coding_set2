package com.wf.coding;

public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton s1 = getInstance();
        Singleton s2 = getInstance();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
