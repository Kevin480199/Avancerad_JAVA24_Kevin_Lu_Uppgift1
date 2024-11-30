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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Truck truck = (Truck) obj;
        return doors == truck.doors && getModel().equals(truck.getModel()) && getRegNumber().equals(truck.getRegNumber());
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
