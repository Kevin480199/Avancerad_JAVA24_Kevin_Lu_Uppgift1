package org.example;

public abstract class Vehicle implements Rentable{
    private String Model;
    private String regNumber;

    Vehicle(String model, String regNumber) {
        this.Model = model;
        this.regNumber = regNumber;

    }
    public String getModel() {
        return Model;
    }
    public String getRegNumber() {
        return regNumber;
    }

}
