package org.example;

public class SUV extends Vehicle {
    private int year;
    private double price = 750;
    static int count = 1;
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SUV suv = (SUV) obj;
        return year == suv.year && getModel().equals(suv.getModel()) && getRegNumber().equals(suv.getRegNumber());
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
