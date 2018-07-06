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
}
