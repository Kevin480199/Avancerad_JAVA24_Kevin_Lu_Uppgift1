package org.example;

public class Truck extends Vehicle {
    private int doors;
    private double price = 1000;
    static int count = 5;
    // Constructor
    public Truck(String model, String regNumber, int doors) {
        // Calls super class constructor
        super(model, regNumber);
        this.doors = doors;

    }
    // Specific methods for class truck
    public int getDoors() {
        return doors;
    }
    public void lockCar(){
        System.out.println("Car locked");
    }
    // Overrides Equals method so two objects can be compared
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Truck truck = (Truck) obj;
        return doors == truck.doors && getModel().equals(truck.getModel()) && getRegNumber().equals(truck.getRegNumber());
    }
    // Called when a Truck is rented
    @Override
    public void rent() {
        count--;
        System.out.println("The Truck has been rented");
    }
    // Calculates the cost of a Truck per hour
    @Override
    public double costs(int hours) {
        return hours*price;
    }
    // Called when a Truck is returned
    @Override
    public void returnVehicle() {
        count++;
        System.out.println("The Truck has been returned");
    }
}
