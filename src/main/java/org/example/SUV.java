package org.example;

public class SUV extends Vehicle {
    private int year;
    private double price = 750;
    static int count = 1;
    // Constructor
    public SUV(String model, String regNumber, int year) {
        // Calls constructor from super class(Vehicle)
        super(model, regNumber);
        this.year = year;

    }
    // Specific methods for SUV class, they aren't used
    public int getYear() {
        return year;
    }
    public void ligthsOn(){
        System.out.println("Ligths on");
    }
    // Overrides method equals. This lets two objects to be compared
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SUV suv = (SUV) obj;
        return year == suv.year && getModel().equals(suv.getModel()) && getRegNumber().equals(suv.getRegNumber());
    }
    // Called when a SUV is rented
    @Override
    public void rent() {
        count--;
        System.out.println("The SUV has been rented");
    }
    // Calculates the cost for a SUV with hour price
    @Override
    public double costs(int hours) {
        return hours*price;
    }
    // Called when a SUV is returned
    @Override
    public void returnVehicle() {
        count++;
        System.out.println("The SUV has benn returned");
    }
}
