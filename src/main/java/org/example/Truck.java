package org.example;

public class Truck extends Vehicle {
    private int doors;
    private double price = 1000;
    static int count = 5;
    public Truck(String model, String regNumber, int doors) {
        super(model, regNumber);
        this.doors = doors;

    }
    public int getDoors() {
        return doors;
    }
    public void lockCar(){
        System.out.println("Car locked");
    }
    @Override
    public void rent() {
        count--;
        System.out.println("Rent");
    }

    @Override
    public double costs(int hours) {
        return hours*price;
    }

    @Override
    public void returnVehicle() {
        count++;
        System.out.println("Return");
    }
}
