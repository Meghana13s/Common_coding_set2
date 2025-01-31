package com.pratice;

public class Singleton {

    private static Singleton singletonInstance=null;

    private Singleton() {}

    public static synchronized Singleton getSingletonInstance() {
        if(singletonInstance==null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }

    public static void main(String[] args) {
        Singleton s = Singleton.getSingletonInstance();
        Singleton ss = Singleton.getSingletonInstance();
        System.out.println(s.hashCode());
        System.out.println(ss.hashCode());

    }
}
