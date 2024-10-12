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
