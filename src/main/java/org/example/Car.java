package org.example;

public class Car extends Vehicle {
    private int wheels;
    public Car(String model, String regNumber, double price, int wheels) {
        super(model, regNumber, price);

    }
    public int getWheels() {
        return wheels;
    }
    public void openDoor(){
        System.out.println("Open door");
    }
}
