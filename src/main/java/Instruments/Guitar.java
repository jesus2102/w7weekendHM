package Instruments;

public class Guitar extends Instrument{

    private int numberOfStrings;

    public Guitar(int numberOfStrings, String typeOfItem, double priceBought, double priceSold, String model){
        super(model, typeOfItem, priceBought, priceSold);
        this.numberOfStrings = numberOfStrings;
    }
}
