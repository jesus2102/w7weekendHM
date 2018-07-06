package InstrumentTest;

import Instruments.Drum;
import org.junit.Before;

public class DrumTest {

    Drum drum;


    @Before
    public void before(){
        drum = new Drum("12", "Rock", 220.00, 390.00, "Y-22");
    }

}
