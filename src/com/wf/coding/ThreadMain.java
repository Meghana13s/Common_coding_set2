package com.wf.coding;

public class ThreadMain {
    public static void main(String[] args) {
        ThreadClass t1 = new ThreadClass();
        t1.start();
        ThreadInterface t3 = new ThreadInterface();
        Thread t2 = new Thread(t3);
        t2.start();


    }
}
