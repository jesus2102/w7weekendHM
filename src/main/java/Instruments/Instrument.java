package Instruments;


import Behaviours.IPlay;
import Shop.Item;

public abstract class Instrument extends Item implements IPlay {

    private String model;

    public Instrument(String model, String typeOfItem, double priceBought, double priceSold) {
        super(typeOfItem, priceBought, priceSold);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String playing(String sound){
        return sound;
    }
}
