package com.spring.bin;

public class Vehicle {
    private String name;
    public Vehicle(String name){
        this.name = name;

    }
    public void run(){
        System.out.println("hello " + name);
    }
}
