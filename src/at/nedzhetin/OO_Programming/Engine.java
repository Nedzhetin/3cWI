package at.nedzhetin.OO_Programming;
import java.util.Scanner;

public class Engine {
    public enum EngineType {DIESEl, GAS, ELECTRIC}
    private int horsePower;
    private int fuelComsuption;
    private int fuelAmount;
    private EngineType engineType;

    public Engine() {
        this.horsePower = 200;
        this.fuelComsuption = 12;
        this.fuelAmount = 100;
        this.engineType = EngineType.GAS;
    }





    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getFuelComsuption() {
        return fuelComsuption;
    }
    public EngineType getEngineType() {
        return engineType;
    }

    Scanner scanner = new Scanner(System.in);

    public void drive(){
        System.out.println("How much km do you want to drive?");
        int howMuchKm = scanner.nextInt();

        if (fuelAmount - fuelComsuption * howMuchKm < 0){
            System.out.println("Not enough fuel");
        }
        else if (fuelAmount - fuelComsuption * howMuchKm >= 0){
            fuelAmount = fuelAmount - fuelComsuption * howMuchKm;
            System.out.println("You drove " + howMuchKm + " km");
        }
    }


    public void giveEngineInfo() {
        System.out.println("horsePower:         " + getHorsePower());
        System.out.println("fuelComsuption:     " + getFuelComsuption());
        System.out.println("fuelAmount:         " + getFuelAmount());
        System.out.println("EngineType:         " + getEngineType());
    }

}
