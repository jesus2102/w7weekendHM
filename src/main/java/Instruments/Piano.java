package Instruments;

public class Piano extends Instrument {

    private int numberOfKeys;
    private boolean pedal;

    public Piano(int numberOfKeys, boolean pedal, String typeOfItem, double priceBought, double priceSold, String model){
        super(model, typeOfItem, priceBought, priceSold);
        this.numberOfKeys = numberOfKeys;
        this.pedal = pedal;
    }

    public int getKeys() {
        return numberOfKeys;
    }

    public boolean getPedal() {
        return pedal;
    }
}
