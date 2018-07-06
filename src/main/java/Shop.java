import java.util.ArrayList;
import Shop.Item;

public class Shop {

    private ArrayList<Item> items;

    public Shop(){
        this.items = new ArrayList<>();
    }

    public int countItems() {
        return this.items.size();
    }
}
