package com.pratiJava8;

class A {
    String i,j;
    A(String i, String j) {
        this.i = i;
        this.j = j;
    }
}

public class FindOutput {
    public static void main(String[] args) {
        final A a = new A(null,null);
        System.out.println(a.i +" "+a.j);
    }
}
