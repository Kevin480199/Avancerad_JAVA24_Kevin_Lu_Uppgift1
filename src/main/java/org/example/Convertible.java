package org.example;

public class Convertible extends Vehicle {
    private int seats;
    private double price = 1500;
    private static int count = 5;
    // Constructor
    public Convertible(String model, String regNumber, int seats) {
        // Calls super class constructor
        super(model, regNumber);
        this.seats = seats;

    }
    // Specific methods for Convertible class
    public int getSeats() {
        return seats;
    }
    public void seatHeater(){
        System.out.println("Seat heater on");
    }
    // Override method equals now lets you compare two objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Convertible convertible = (Convertible) obj;
        return seats == convertible.seats && getModel().equals(convertible.getModel()) && getRegNumber().equals(convertible.getRegNumber());
    }
    // Method called when a Convertible is rented
    @Override
    public void rent() {
        count--;
        System.out.println("The Convertible has been rented");
    }
    // Called to calculate the cost per hour for a Convertible
    @Override
    public double costs(int hours) {
        return hours*price;
    }
    // Called when a Convertible is returned
    @Override
    public void returnVehicle() {
        count++;
        System.out.println("The Convertible has been returned");
    }
}
