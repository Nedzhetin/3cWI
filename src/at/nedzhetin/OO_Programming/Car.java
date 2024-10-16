package at.nedzhetin.OO_Programming;

public class Car {
   private String brand;
   private String color;
   private int fuelConsumption;
   private int fuelAmount;
   private  String serialNumber;


   public Car()   {


   }
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
      System.out.println("\nnot enough fuel\n");
   }else {
      System.out.println("\nDriving (1km)\n");
   }
}

public void getRemainingRange(){
   int ramainingRange = this.fuelAmount/this.fuelConsumption;
   System.out.println( "\nRemaining range: " + ramainingRange + "km\n");
}

public void turboBoost(){
   if (this.fuelAmount > 10){
      System.out.println( "\nTurboBoost activated\n");
   }else {
      System.out.println( "\nTurboBoost not available. Not enough fuel\n");
   }
   }

   public void honk(int times){
      System.out.println("");
   for (int i = 0; i < times; i++){
      System.out.println("Tuuut");
   }
      System.out.println("");
   }


}
