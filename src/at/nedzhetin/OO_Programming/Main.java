package at.nedzhetin.OO_Programming;

import at.nedzhetin.OO_Programming.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car c1 = null;

        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;


        while (!isFinished) {

            System.out.println("\n1.New Car");
            System.out.println("2.Drive");
            System.out.println("3.TurboBoost");
            System.out.println("4.Honk");
            System.out.println("5.Give car info");
            System.out.println("6.Quit");
            int selection = scanner.nextInt();

            if (selection == 1) {
                System.out.println("Brand:");
                String newBrand = scanner.next();
                System.out.println("Color:");
                String newColor = scanner.next();
                System.out.println("fuel consumption:");
                int newFuelConsumption = scanner.nextInt();
                System.out.println("fuel Amount:");
                int newFuelAmount = scanner.nextInt();
                System.out.println("Serial Number:");
                String newSerialNumber = scanner.next();
                c1 = new Car(newBrand, newColor, newFuelConsumption, newFuelAmount,newSerialNumber);


            }

            if (selection == 2) {
                if (c1 != null) {
                    c1.drive();
                }else{
                    System.out.println("you dont have a car");
                }

            }
            if (selection == 3) {
                if (c1 != null){
                    c1.turboBoost();
                }else{
                    System.out.println("you dont have a car");
                }

            }
            if (selection == 4) {
                if (c1 != null){
                    c1.honk(3);
                }else{
                    System.out.println("you dont have a car");
                }

            }

            if (selection == 5) {
                if (c1 != null){
                    System.out.println("Brand:            " + c1.getBrand());
                    System.out.println("Color:            " + c1.getColor());
                    System.out.println("Fuel consumption: " + c1.getFuelConsumption());
                    System.out.println("Fuel amount:      " + c1.getFuelAmount());
                    System.out.println("Serial number:    " + c1.getSerialNumber());
                    System.out.println("");
                }else{
                    System.out.println("you dont have a car");
                }


            }
            if (selection == 6) {
                isFinished = true;
            }
        }


    }
}


