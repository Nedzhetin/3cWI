package at.nedzhetin.OO_Programming;

public class Engine {
    private enum EngineType {DIESEl, GAS, ELECTRIC}
    private int horsePower;
    private int fuelComsuption;
    private int fuelAmount;
    private EngineType engineType;

    public Engine(int horsePower, int fuelComsuption, int fuelAmount, EngineType engineType) {
        this.horsePower = horsePower;
        this.fuelComsuption = fuelComsuption;
        this.fuelAmount = fuelAmount;
        this.engineType = engineType;
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
}
