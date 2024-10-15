package at.nedzhetin.OO_Programming;
import at.nedzhetin.OO_Programming.Car;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("BMW","red", 10, 5, "123456");
        Car c2 = new Car("Audi", "blue", 5,5, "654321");


        System.out.println(c1.getBrand());


        c1.drive();
        c1.getRemainingRange();

        //  c1.turboBoost();
        // c1.honk(5);




    }
}
