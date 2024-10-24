package at.nedzhetin.OO_Programming;

public class Car {
   private Engine engine;
   private String brand;
   private String color;
   private String serialNumber;


   public Car() {


   }

   public Car(String brand, String color, String serialNumber, Engine engine) {
      this.brand = brand;
      this.color = color;
      this.engine = engine;

      this.serialNumber = serialNumber;
   }


   public String getBrand() {
      return brand;
   }

   public void setBrand(String brand) {
      this.brand = brand;
   }


   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }


   public Engine getEngine() {
      return engine;
   }

   public void setEngine(Engine engine) {
      this.engine = engine;
   }

   public String getSerialNumber() {
      return serialNumber;
   }

   public void setSerialNumber(String serialNumber) {
      this.serialNumber = serialNumber;
   }


   public void drive() {

   }


   public void getRemainingRange() {
      int ramainingRange = this.engine.getFuelAmount() / this.engine.getFuelComsuption();
      System.out.println("\nRemaining range: " + ramainingRange + "km\n");
   }

   public void turboBoost() {
      if (this.engine.getFuelAmount() > 10) {
         System.out.println("\nTurboBoost activated\n");
      } else {
         System.out.println("\nTurboBoost not available. Not enough fuel\n");
      }
   }

   public void honk(int times) {
      System.out.println("");
      for (int i = 0; i < times; i++) {
         System.out.println("Tuuut");
      }
      System.out.println("");
   }


}
