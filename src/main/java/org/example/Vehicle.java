package org.example;

public abstract class Vehicle implements Rentable{
    private String model;
    private String regNumber;

    Vehicle(String model, String regNumber) {
        this.model = model;
        this.regNumber = regNumber;

    }
    public String getModel() {
        return model;
    }
    public String getRegNumber() {
        return regNumber;
    }

}
