package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    ArrayList<Vehicle> carForRent;
    ArrayList<Vehicle> rentedVehicles;
    Scanner scanner;
    Application(){
        boolean running = true;
        scanner = new Scanner(System.in);
        carForRent = new ArrayList<>();
        // Adds car to arrayList
        carForRent.add(new Car("BMW","123 ABC", 4));
        carForRent.add(new SUV("Honda","123 XYZ", 2024));
        carForRent.add(new Truck("Hyundai", "123 FDS", 4));
        carForRent.add(new Convertible("Mercedes", "123 TYU", 4));
        rentedVehicles = new ArrayList<>();
        do{
            System.out.println("Choose Vehicle to rent");
            System.out.println("1. Car");
            System.out.println("2. SUV");
            System.out.println("3. Truck");
            System.out.println("4. Convertible");
            System.out.println("5. Exit");
            int option = scanner.nextInt();
            switch(option){
                case 1:
                    rentOrReturn();
                    option = scanner.nextInt();
                    Car target1 = new Car("BMW","123 ABC", 4);
                    switch(option){
                        case 1:
                            rentMethod(target1);
                            break;
                        case 2:
                            returnMethod(target1);
                            break;
                        case 3:
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
        System.out.println("How long do you want to rent?");
        int hour = scanner.nextInt();
        if (carForRent.contains(target)){
            int index = carForRent.indexOf(target);
            double price = carForRent.get(index).costs(hour);
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
            int index = rentedVehicles.indexOf(target);
            rentedVehicles.get(index).returnVehicle();
            rentedVehicles.remove(index);
            carForRent.add(target);
        }
    }

    private void rentMethod(Vehicle target) {
        // If the vehicle hasn't been rented
        if (carForRent.contains(target)){
            int index = carForRent.indexOf(target);
            carForRent.get(index).rent();
            carForRent.remove(index);
            rentedVehicles.add(target);

        }else {
            System.out.println("All cars are rented");
        }
    }

    private void rentOrReturn() {
        System.out.println("1.Rent");
        System.out.println("2.Return");
        System.out.println("3.Cost");

    }
}
