package org.example;

public class SUV extends Vehicle {
    private int year;
    public SUV(String model, String regNumber, double price, int year) {
        super(model, regNumber, price);
        this.year = year;

    }
    public int getYear() {
        return year;
    }
    public void ligthsOn(){
        System.out.println("Ligths on");
    }
}
