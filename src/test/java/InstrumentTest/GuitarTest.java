package InstrumentTest;

import Instruments.Guitar;
import org.junit.Before;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(6, "Accoustic", 160.00, 270.00, "AL-230");
    }
}
