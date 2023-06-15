package com.driver;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.meth());
    }
}

class A{
    public static String meth() {
        rerturn "Invoking method from class A";
    }
}

class B extends A {
    @Override
    public String meth() {
        return super.meth();
        // return "Method is overridden in Extended class B";
    }
}
