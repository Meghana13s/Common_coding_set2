package com.wf.coding;

public class SingletonMultiThread {

    private  volatile static SingletonMultiThread instance;
    private SingletonMultiThread(){}

    public static SingletonMultiThread getInstance() {

        if(instance==null) {
            synchronized (SingletonMultiThread.class) {
                if(instance == null) {
                    instance = new SingletonMultiThread();
                }
            }
        }
        return instance;
    }


}
