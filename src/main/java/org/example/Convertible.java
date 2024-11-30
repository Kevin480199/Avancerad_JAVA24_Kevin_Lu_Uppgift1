package org.example;

public class Convertible extends Vehicle {
    private int seats;
    public Convertible(String model, String regNumber, double price, int seats) {
        super(model, regNumber, price);
        this.seats = seats;

    }
    public int getSeats() {
        return seats;
    }
    public void seatHeater(){
        System.out.println("Seat heater on");
    }
}
