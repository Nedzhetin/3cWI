package at.nedzhetin.OO_Programming.Car;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Car c1 = null;
        Driver d1 = new Driver("Nejo", 18, "Man");


        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;


        while (!isFinished) {

            System.out.print("\n1.New Car\t\t");
            System.out.print("2.Drive\t\t");
            System.out.print("3.getRemainingRange\t\t");
            System.out.print("4.Honk\t\t");
            System.out.print("5.Give car info\t\t");
            System.out.print("6.Give Engine info\t\t");
            System.out.print("7.Delete Car\t\t");
            System.out.print("8.Quit\t\t");
            int selection = scanner.nextInt();

            if (selection == 1) {
                c1 = new Car();
                for (int i = 0; i < Car.Brand.values().length; i++) {
                    System.out.println(i+1 + "." + Car.Brand.values()[i]);
                }
                int newBrand =  scanner.nextInt();
                c1.setBrand(Car.Brand.valueOf(newBrand));

                for (int i = 0; i < Car.Color.values().length; i++) {
                    System.out.println(i+1 + "." + Car.Color.values()[i]);
                }
                int newColor = scanner.nextInt();
                c1.setColor(Car.Color.valueOf(newColor));


                System.out.println("Serial Number:");
                String newSerialNumber = scanner.next();
                c1.setSerialNumber(newSerialNumber);

                c1.setDriver(d1);
                c1.setEngine(new Engine());


                d1.pushCar(c1);




                System.out.println(d1.getCars());


            }

            if (selection == 2) {

                if (c1 != null) {
                    c1.getEngine().drive();
                } else {
                    System.out.println("you dont have a car");
                }

            }
            if (selection == 3) {
                c1.getRemainingRange();
            }

            if (selection == 4) {
                c1.honk(3);
            }

            if (selection == 5) {
                d1.printAllCarInfo();
            }

            if (selection == 6) {
                if (c1 != null) {
                    c1.getEngine().giveEngineInfo();
                } else {
                    System.out.println("you dont have a car");
                }

            }

            if (selection == 7) {
                d1.deleteCar();
            }

            if (selection == 8) {
                isFinished = true;
            }
        }

    }
}


