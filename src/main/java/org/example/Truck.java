package org.example;

public class Truck extends Vehicle {
    private int doors;
    public Truck(String model, String regNumber, double price, int doors) {
        super(model, regNumber, price);
        this.doors = doors;

    }
    public int getDoors() {
        return doors;
    }
    public void lockCar(){
        System.out.println("Car locked");
    }
}
