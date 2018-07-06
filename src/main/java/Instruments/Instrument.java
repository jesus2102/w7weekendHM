package Instruments;


import Shop.Item;

public abstract class Instrument extends Item {

    private String model;

    public Instrument(String model){
        super(type, priceBuyed, priceSold);
        this.model = model;
    }
}
