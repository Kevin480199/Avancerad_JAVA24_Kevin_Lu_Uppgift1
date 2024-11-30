package org.example;

public class Car extends Vehicle {
    private int wheels;
    private double price = 500;
    static int count = 1;
    public Car(String model, String regNumber, int wheels) {
        super(model, regNumber);

    }
    public int getWheels() {
        return wheels;
    }
    public void openDoor(){
        System.out.println("Open door");
    }

    @Override
    public void rent() {
        count--;
        System.out.println("Rent");
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return wheels == car.wheels && getModel().equals(car.getModel()) && getRegNumber().equals(car.getRegNumber());
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
