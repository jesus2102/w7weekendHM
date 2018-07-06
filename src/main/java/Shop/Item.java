package Shop;

public abstract class Item {

    private String type;
    private double priceBuyed;
    private double priceSold;

    public Item(String type, double priceBuyed, double priceSold){
        this.type = type;
        this.priceBuyed = priceBuyed;
        this.priceSold = priceSold;

    }

}
