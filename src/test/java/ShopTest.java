import Instruments.Guitar;
import Instruments.Piano;
import OtherItems.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    GuitarString guitarString;
    Piano piano;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar(6, "Accoustic", 160.00, 270.00, "AL-230");
        piano = new Piano(64, true, "Classic", 450.00, 680.00, "Yamaha 920L");
        guitarString = new GuitarString("Accoustic", 2.00, 4.00);
    }

    @Test
    public void canCountItems(){
        assertEquals(0, shop.countItems());
    }

    @Test
    public void canAddItem(){
        shop.add(guitar);
        assertEquals(1, shop.countItems());
    }
}
