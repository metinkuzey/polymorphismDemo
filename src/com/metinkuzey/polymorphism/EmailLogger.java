package com.metinkuzey.polymorphism;

public class EmailLogger extends Logger{
    @Override
    public void log(){
        System.out.println("Logged in email");
    }
}
