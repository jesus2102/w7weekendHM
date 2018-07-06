package Instruments;

public class Piano extends Instrument {

    private int numberOfKeys;
    private boolean pedal;

    public Piano(int numberOfkeys, boolean pedal, String typeOfItem, double priceBought, double priceSold, String model){
        super(model, typeOfItem, priceBought, priceSold);
        this.numberOfKeys = numberOfkeys;
        this.pedal = pedal;
    }
}
