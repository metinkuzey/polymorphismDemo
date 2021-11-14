package com.metinkuzey.polymorphism;

public class Main {
    public static void main(String[] args) {
    CustomerManager customers = new CustomerManager();
    customers.add(new DatabaseLogger());
    customers.add(new EmailLogger());
    customers.add(new FileLogger());
    }
}
