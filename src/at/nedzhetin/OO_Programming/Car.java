package at.nedzhetin.OO_Programming;

public class Car {
   public String brand;
   public String color;
   public int fuelConsumption;
   public int fuelAmount;
   public  String serialNumber;

public void drive() {
   this.fuelAmount = this.fuelAmount - this.fuelConsumption;

   System.out.println( "Driving");
}
}
