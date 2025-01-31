package com.pratice;

public class SingletonAgain {

    private static SingletonAgain SingletonInstance = null;

    public static synchronized SingletonAgain getSingletonInstance() {
        if(SingletonInstance == null ) {
            SingletonInstance = new SingletonAgain();
        }
        return SingletonInstance;
    }

    private SingletonAgain() {}


    public static void main(String[] args) {

    }
}
