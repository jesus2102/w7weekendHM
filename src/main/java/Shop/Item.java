package Shop;

public abstract class Item {

    private String typeOfItem;
    private double priceBought;
    private double priceSold;

    public Item(String typeOfItem, double priceBought, double priceSold){
        this.typeOfItem = typeOfItem;
        this.priceBought = priceBought;
        this.priceSold = priceSold;

    }

}
