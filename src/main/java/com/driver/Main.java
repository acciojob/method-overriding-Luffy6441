package com.driver;

public class Main {
    public static void main(String args[])
    {
    } 
}

class A{
    public String meth(){
        return "Invoking method from class A";
    }
}

class B{
    public String meth(){
        return super.meth();
    }
}
