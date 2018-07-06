import java.util.ArrayList;
import Instruments.Guitar;
import Instruments.Piano;
import Shop.Item;

public class Shop {

    private ArrayList<Item> items;

    public Shop(){
        this.items = new ArrayList<>();
    }

    public int countItems() {
        return this.items.size();
    }

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        items.remove(item);
    }
}
