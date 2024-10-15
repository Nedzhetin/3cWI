package at.nedzhetin.OO_Programming;
import at.nedzhetin.OO_Programming.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("...", "...", 0, 0, "...");

        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;


        while (!isFinished){
            System.out.println("1.New Car");
            System.out.println("2.Drive");
            System.out.println("3.TurboBoost");
            System.out.println("4.Honk");
            System.out.println("5.Give car info");
            System.out.println("6.Quit");
            int selection = scanner.nextInt();

            if (selection == 1){
                System.out.println("Brand:");
                String newBrand = scanner.next();
                System.out.println("Color:");
                String newColor = scanner.next();
                System.out.println("fuel consumption:");
                int newFuelConsumption = scanner.nextInt();
                System.out.println("fuel Amount:");
                int newFuelAmount = scanner.nextInt();
                System.out.println("Serial Number:");
                String serialNumber = scanner.next();

                c1.setBrand(newBrand);
                c1.setColor(newColor);
                c1.setFuelConsumption(newFuelConsumption);
                c1.setFuelAmount(newFuelAmount);
                c1.setSerialNumber(serialNumber);

            }

            if (selection == 2){
                c1.drive();
            }
            if (selection == 3){
                c1.turboBoost();
            }
            if (selection == 4){
                c1.honk(3);
            }

            if(selection == 5){
                System.out.println("Brand:            " + c1.getBrand());
                System.out.println("Color:            " + c1.getColor());
                System.out.println("Fuel consumption: " + c1.getFuelConsumption());
                System.out.println("Fuel amount:      " + c1.getFuelAmount());
                System.out.println("Serial number:    " + c1.getSerialNumber());
                System.out.println("");
            }
            if (selection == 6){
                isFinished = true;
            }
        }


    }
}
