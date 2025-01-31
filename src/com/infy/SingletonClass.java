package com.infy;

public class SingletonClass {
    private static SingletonClass instance;

    private SingletonClass() { }

    public static synchronized SingletonClass getInstance() {
        if(instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }


//    public static void main(String[] args) {
//        // wrong way
////        SingletonClass sing = new SingletonClass();
////        SingletonClass sings = new SingletonClass();
//        //correct way
//        SingletonClass sing = SingletonClass.getInstance();
//        SingletonClass sings = SingletonClass.getInstance();
//        System.out.println(sing.hashCode());
//        System.out.println(sings.hashCode());
////        sings.showMessage();
////        sing.showMessage();
//
//    }
}
