package Instruments;


import Shop.Item;

public abstract class Instrument extends Item {

    private String model;

    public Instrument(String model, String typeOfItem, double priceBought, double priceSold){
        super(typeOfItem, priceBought, priceSold);
        this.model = model;
    }
}
