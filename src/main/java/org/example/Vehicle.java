package org.example;

public abstract class Vehicle {
    private String Model;
    private String regNumber;
    private double price;
    Vehicle(String model, String regNumber, double price) {
        this.Model = model;
        this.regNumber = regNumber;
        this.price = price;
    }
}
