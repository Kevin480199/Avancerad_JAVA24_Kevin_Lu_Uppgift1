package org.example;

public class SUV extends Vehicle {
    private int year;
    private double price = 750;
    static int count = 5;
    public SUV(String model, String regNumber, int year) {
        super(model, regNumber);
        this.year = year;

    }
    public int getYear() {
        return year;
    }
    public void ligthsOn(){
        System.out.println("Ligths on");
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
