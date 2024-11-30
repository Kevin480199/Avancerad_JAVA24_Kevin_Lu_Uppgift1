package org.example;

public class Convertible extends Vehicle {
    private int seats;
    private double price = 1500;
    private static int count = 5;
    public Convertible(String model, String regNumber, int seats) {
        super(model, regNumber);
        this.seats = seats;

    }
    public int getSeats() {
        return seats;
    }
    public void seatHeater(){
        System.out.println("Seat heater on");
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
