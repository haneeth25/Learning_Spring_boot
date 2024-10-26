package com.haneeth.example;

public class MyFirstClass {
    private String myVar;

    // Creating a Constructor
    public MyFirstClass(String myVar){
        this.myVar = myVar;
    }
    public String sayHello(){
        return "hello from my first class "+ myVar;
    }
}
