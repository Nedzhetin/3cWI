package at.nedzhetin.OO_Programming;

import at.nedzhetin.OO_Programming.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car c1 = null;

        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;


        while (!isFinished) {

            System.out.print("\n1.New Car            ");
            System.out.print("2.Drive           ");
            System.out.print("3.getRemainingRange        ");
            System.out.print("4.Honk             ");
            System.out.print("5.Give car info             ");
            System.out.print("6.Quit            ");
            int selection = scanner.nextInt();

            if (selection == 1) {
                c1 = new Car();
                System.out.println("Brand:");
                String newBrand = scanner.next();
                c1.setBrand(newBrand);

                System.out.println("Color:");
                String newColor = scanner.next();
                c1.setColor(newColor);


                System.out.println("Serial Number:");
                String newSerialNumber = scanner.next();
                c1.setSerialNumber(newSerialNumber);




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
                    c1.getRemainingRange();
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


