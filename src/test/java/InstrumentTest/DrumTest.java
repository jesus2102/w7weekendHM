package InstrumentTest;

import Instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;


    @Before
    public void before(){
        drum = new Drum(12, "Rock", 220.00, 390.00, "Y-22");
    }

    @Test
    public void hasDrums(){
        assertEquals(12, drum.getNumberOfDrums());
    }

}
