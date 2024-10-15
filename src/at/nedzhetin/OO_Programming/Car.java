package at.nedzhetin.OO_Programming;

public class Car {
   public String brand;
   public String color;
   public int fuelConsumption;
   public int fuelAmount;
   public  String serialNumber;

   public Car(String brand, String color, int fuelConsumption, int fuelAmount, String serialNumber) {
      this.brand = brand;
      this.color = color;
      this.fuelConsumption = fuelConsumption;
      this.fuelAmount = fuelAmount;
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


   public int getFuelConsumption() {
      return fuelConsumption;
   }

   public void setFuelConsumption(int fuelConsumption) {
      this.fuelConsumption = fuelConsumption;
   }


   public int getFuelAmount() {
      return fuelAmount;
   }

   public void setFuelAmount(int fuelAmount) {
      this.fuelAmount = fuelAmount;
   }


   public String getSerialNumber() {
      return serialNumber;
   }

   public void setSerialNumber(String serialNumber) {
      this.serialNumber = serialNumber;
   }


   public void drive() {
   this.fuelAmount = this.fuelAmount - this.fuelConsumption;

   if ( this.fuelAmount < 0){
      System.out.println("not enough fuel");
   }else {
      System.out.println("Driving (1km)");
   }
}

public void getRemainingRange(){
   int ramainingRange = this.fuelAmount/this.fuelConsumption;
   System.out.println( "Remaining range: " + ramainingRange + "km");
}

public void turboBoost(){
   if (this.fuelAmount > 10){
      System.out.println( "TurboBoost activated");
   }else {
      System.out.println( "TurboBoost not available. Not enough fuel");
   }
   }

   public void honk(int times){
   for (int i = 0; i < times; i++){
      System.out.println("Tuuut");
   }
   }

}
