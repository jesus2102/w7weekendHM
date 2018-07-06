package InstrumentTest;

import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(6, "Accoustic", 160.00, 270.00, "AL-230");
    }

    @Test
    public void hasStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void hasType(){
        assertEquals("Accoustic", guitar.getType());
    }

    @Test
    public void hasPriceBought(){
        assertEquals(160.00, guitar.getPriceBought(), 0.00);
    }

    @Test
    public void hasPriceSold(){
        assertEquals(270.00, guitar.getPriceSold(), 0.00);
    }
}
