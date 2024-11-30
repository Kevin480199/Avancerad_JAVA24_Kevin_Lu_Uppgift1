package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    Application(){
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> carForRent = new ArrayList<>();
        carForRent.add(new Car("BMW","123 ABC", 4));
        carForRent.add(new SUV("Honda","123 XYZ", 2024));
        carForRent.add(new Truck("Hyundai", "123 FDS", 4));
        carForRent.add(new Convertible("Mercedes", "123 TYU", 4));
        ArrayList<Vehicle> rentedVehicles = new ArrayList<>();
        do{
            System.out.println("Choose Vehicle");
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
                    switch(option){
                        case 1:
                            if (Car.count > 0){
                                Car target = new Car("BMW","123 ABC", 4);
                                int index = carForRent.indexOf(target);
                                carForRent.get(index).rent();
                                carForRent.remove(index);
                                rentedVehicles.add(target);

                            }else {
                                System.out.println("All cars are rented");
                            }
                            break;
                        case 2:
                            Car target = new Car("BMW","123 ABC", 4);
                            int index = rentedVehicles.indexOf(target);
                            rentedVehicles.get(index).returnVehicle();
                            rentedVehicles.remove(index);
                            carForRent.add(target);

                    }

                    break;
                case 2:
                    rentOrReturn();
                    break;
                case 3:
                    rentOrReturn();
                    break;
                case 4:
                    rentOrReturn();
                    break;
                case 5:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
            }
        }while(running);
    }

    private void rentOrReturn() {
        System.out.println("1.Rent");
        System.out.println("2.Return");

    }
}