package at.nedzhetin.OO_Programming;
import at.nedzhetin.OO_Programming.Car;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.brand = "BMW";
        c1.color = "red";
        c1.fuelConsumption = 10;
        c1.fuelAmount = 100;
        c1.serialNumber = "123456";

        c2.brand = "Audi";
        c2.color = "blue";
        c2.fuelConsumption = 5;
        c2.fuelAmount = 5;
        c2.serialNumber = "654321";

        c1.drive();
        System.out.println(c1.fuelAmount);


    }
}
