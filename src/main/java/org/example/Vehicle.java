package org.example;

public abstract class Vehicle implements Rentable{
    private String model;
    private String regNumber;
    // Constructor calls when object is instantiated
    Vehicle(String model, String regNumber) {
        // Sets this.model to model
        this.model = model;
        this.regNumber = regNumber;

    }
    // Gets model and returns its value
    public String getModel() {
        return model;
    }
    // Gets regNumber and returns its value
    public String getRegNumber() {
        return regNumber;
    }

}
