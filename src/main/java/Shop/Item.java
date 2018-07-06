package Shop;

import Behaviours.ISell;

public abstract class Item implements ISell{

    private String typeOfItem;
    private double priceBought;
    private double priceSold;

    public Item(String typeOfItem, double priceBought, double priceSold){
        this.typeOfItem = typeOfItem;
        this.priceBought = priceBought;
        this.priceSold = priceSold;

    }

    public String getType() {
        return typeOfItem;
    }

    public double getPriceBought() {
        return priceBought;
    }

    public double getPriceSold() {
        return priceSold;
    }

    public double calculateMarkUp(Item item){
        double markUp = this.priceSold - this.priceBought;
        return markUp;
    }
}
