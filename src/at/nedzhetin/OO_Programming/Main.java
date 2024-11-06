package at.nedzhetin.OO_Programming;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Car c1 = null;

        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;


        while (!isFinished) {

            System.out.print("\n1.New\t\t");
            System.out.print("2.Drive\t\t");
            System.out.print("3.getRemainingRange\t\t");
            System.out.print("4.Honk\t\t");
            System.out.print("5.Give car info\t\t");
            System.out.print("6.Give Engine info\t\t");
            System.out.print("7.Quit\t\t");
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

                c1.setEngine(new Engine());




            }

            if (selection == 2) {
                if (c1 != null) {
                    c1.getEngine().drive();
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
                    c1.giveCarInfo();
                }else{
                    System.out.println("you dont have a car");
                }


            }

            if (selection == 6) {
                if (c1 != null) {
                  c1.getEngine().giveEngineInfo();
                } else {
                    System.out.println("you don't have a car");
                }

            }
            if (selection == 7) {
                isFinished = true;
            }
        }

    }
}


