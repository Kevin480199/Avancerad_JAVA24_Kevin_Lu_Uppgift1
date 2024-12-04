package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    ArrayList<Vehicle> carForRent;
    ArrayList<Vehicle> rentedVehicles;
    Scanner scanner;
    Application(){
        // Sets boolean running to true
        boolean running = true;
        // Creates a scanner
        scanner = new Scanner(System.in);
        // Creates an arraylist for non-rented cars
        carForRent = new ArrayList<>();
        // Adds car to arrayList
        carForRent.add(new Car("BMW","123 ABC", 4));
        carForRent.add(new SUV("Honda","123 XYZ", 2024));
        carForRent.add(new Truck("Hyundai", "123 FDS", 4));
        carForRent.add(new Convertible("Mercedes", "123 TYU", 4));
        // Creates an empty arraylist
        rentedVehicles = new ArrayList<>();
        do{
            // Prints out menu
            System.out.println("Choose Vehicle to rent");
            System.out.println("1. Car");
            System.out.println("2. SUV");
            System.out.println("3. Truck");
            System.out.println("4. Convertible");
            System.out.println("5. Exit");
            // Scan for integer
            int option = scanner.nextInt();
            switch(option){
                case 1:
                    // Calls method
                    rentOrReturn();
                    // Scans for integer
                    option = scanner.nextInt();
                    // Saves target car into a variable
                    Car target1 = new Car("BMW","123 ABC", 4);
                    switch(option){
                        case 1:
                            // Calls rentMethod
                            rentMethod(target1);
                            break;
                        case 2:
                            // Calls returnMethod
                            returnMethod(target1);
                            break;
                        case 3:
                            // Calls CalcCost method
                            CalcCost(target1);
                    }
                    break;
                case 2:
                    rentOrReturn();
                    option = scanner.nextInt();
                    SUV target2 = new SUV("Honda","123 XYZ", 2024);
                    switch(option){
                        case 1:
                            rentMethod(target2);
                            break;
                        case 2:
                            returnMethod(target2);
                            break;
                        case 3:
                            CalcCost(target2);
                    }
                    break;
                case 3:
                    rentOrReturn();
                    option = scanner.nextInt();
                    Truck target3 = new Truck("Hyundai", "123 FDS", 4);
                    switch(option){
                        case 1:
                            rentMethod(target3);
                            break;
                        case 2:
                            returnMethod(target3);
                            break;
                        case 3:
                            CalcCost(target3);
                    }
                    break;
                case 4:
                    rentOrReturn();
                    option = scanner.nextInt();
                    Convertible target4 = new Convertible("Mercedes", "123 TYU", 4);
                    switch(option){
                        case 1:
                            rentMethod(target4);
                            break;
                        case 2:
                            returnMethod(target4);
                            break;
                        case 3:
                            CalcCost(target4);
                    }
                    break;
                case 5:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
            }
        }while(running);
    }

    private void CalcCost(Vehicle target) {
        // Prints out a text in console
        System.out.println("How long do you want to rent?");
        // Scans next integer hour for how long the vehicle will be rented
        int hour = scanner.nextInt();
        // Check if vehicle is in carForRent array
        if (carForRent.contains(target)){
            // Get index for target vehicle
            int index = carForRent.indexOf(target);
            // Calculate the cost depending on how many hours
            double price = carForRent.get(index).costs(hour);
            // Prints out price in console
            System.out.println("The price for " + hour + " hour is " + price);
        }else{
            int index = rentedVehicles.indexOf(target);
            double price = rentedVehicles.get(index).costs(hour);
            System.out.println("The price for " + hour + " hour is " + price);
        }
    }

    private void returnMethod(Vehicle target) {
        // If carForRent contains the vehicle, the vehicle hasn't been rented
        if (carForRent.contains(target)){
            System.out.println("The car hasn't been rented");
        }else{
            // Find the index of target vehicle
            int index = rentedVehicles.indexOf(target);
            // Calls method return vehicle
            rentedVehicles.get(index).returnVehicle();
            // Removes target vehicle from rentedVehicles arraylist
            rentedVehicles.remove(index);
            // Adds target vehicle to carForRent arraylist
            carForRent.add(target);
        }
    }

    private void rentMethod(Vehicle target) {
        // If the vehicle hasn't been rented
        if (carForRent.contains(target)){
            // Find the index of target vehicle
            int index = carForRent.indexOf(target);
            // Calls method rent on vehicle
            carForRent.get(index).rent();
            // Removes target vehicle from carForRent arraylist
            carForRent.remove(index);
            // Adds target vehicle to rentedVehicles arraylist
            rentedVehicles.add(target);

        }else {
            // The vehicle is rented, doesn't exist in carForRent arraylist
            System.out.println("The vehicle is rented");
        }
    }

    private void rentOrReturn() {
        // Prints out these options in console
        System.out.println("1.Rent");
        System.out.println("2.Return");
        System.out.println("3.Cost");

    }
}
