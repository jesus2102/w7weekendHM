package Instruments;

public class Drum extends Instrument {

    private int numberOfDrums;

    public Drum(int numberOfDrums, String typeOfItem, double priceBought, double priceSold, String model){
        super(model, typeOfItem, priceBought, priceSold);
        this.numberOfDrums = numberOfDrums;
    }
}
