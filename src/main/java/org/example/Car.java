package org.example;

public class Car extends Vehicle {
    private int wheels;
    private double price = 500;
    static int count = 1;
    // Constructor
    public Car(String model, String regNumber, int wheels) {
        // Calls super class constructor(Vehicle)
        super(model, regNumber);
        this.wheels = wheels;

    }
    // Specific methods for this class, not used
    public int getWheels() {
        return wheels;
    }
    public void openDoor(){
        System.out.println("Open door");
    }
    // Called when a car is rented and out puts a text in console
    @Override
    public void rent() {
        count--;
        System.out.println("The car has been rented");
    }
    // Overrides equals method. Now it will compare two objects and its values
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return wheels == car.wheels && getModel().equals(car.getModel()) && getRegNumber().equals(car.getRegNumber());
    }
    // Calculates the cost per chosen hour
    @Override
    public double costs(int hours) {
        return hours*price;
    }

    // Called when a vehicle is returned and prints out a text in console
    @Override
    public void returnVehicle() {
        count++;
        System.out.println("The car has been returned");
    }
}
