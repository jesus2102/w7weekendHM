package InstrumentTest;

import Instruments.Piano;
import org.junit.Before;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(64, true);
    }
}
