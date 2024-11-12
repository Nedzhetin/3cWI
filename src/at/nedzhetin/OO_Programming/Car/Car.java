package at.nedzhetin.OO_Programming.Car;

import java.util.Arrays;

public class Car {
   private Engine engine;
   private Driver driver;
   private Color color;
   private String serialNumber;
   private Brand brand;

   public enum Brand {
      Audi(1), BMW(2), Mercedes(3);

      private final int value;

      Brand(int value) {
         this.value = value;
      }

      public static Brand valueOf(int value) {
         return Arrays.stream(values())
                 .filter(legNo -> legNo.value == value)
                 .findFirst().get();
      }
   }

   public enum Color{
      Pink(1),Blue(2),Black(3),White(4);

      private final int value;

      Color(int value) {
         this.value = value;
      }

      public static Color valueOf(int value) {
         return Arrays.stream(values())
                 .filter(legNo -> legNo.value == value)
                 .findFirst().get();
      }
   }

   public Car() {}


   public Car(Brand brand, Color color, String serialNumber, Engine engine, Driver driver) {
      this.brand = brand;
      this.color = color;
      this.engine = engine;
      this.serialNumber = serialNumber;
      this.driver = driver;
   }



   public String getBrand() {
      return brand.toString(); // why toString?
   }

   public void setBrand(Brand brand) {
      this.brand = brand;
   }


   public String getColor() {
      return color.toString();
   }

   public void setColor(Color color) {
      this.color = color;
   }


   public Engine getEngine() {
      return engine;
   }

   public void setEngine(Engine engine) {
      this.engine = engine;
   }

   public Driver getDriver() {
      return driver;
   }
   public void setDriver(Driver driver) {
      this.driver = driver;
   }

   public String getSerialNumber() {
      return serialNumber;
   }

   public void setSerialNumber(String serialNumber) {
      this.serialNumber = serialNumber;
   }



   public void giveCarInfo() {
      System.out.println("Brand:            " + getBrand());
      System.out.println("Color:            " + getColor());
      System.out.println("Serial number:    " + getSerialNumber());
      System.out.println("");
   }





   public void getRemainingRange() {
      if (!driver.getCars().isEmpty()) {
         int ramainingRange = this.engine.getFuelAmount()/ this.engine.getFuelComsuption();
         System.out.println("\nRemaining range: " + ramainingRange + "km\n");
      }else {
         System.out.println("No cars available");
      }

   }



   public void honk(int times) {
      if (!driver.getCars().isEmpty()) {
         System.out.println("");
         for (int i = 0; i < times; i++) {
            System.out.println("Tuuut");
         }
         System.out.println("");
      }else {
         System.out.println("No cars available");
      }

   }

   @Override
   public String toString() {
      return "\nCar{brand='" + brand + "', color='" + color + "', serialNumber='" + serialNumber + "'}\n";
   }


}
