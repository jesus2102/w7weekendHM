package InstrumentTest;

import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(64, true, "Classic", 450.00, 680.00, "Yamaha 920L");
    }

    @Test
    public void hasKeys(){
        assertEquals(64, piano.getNumberOfKeys());
    }

    @Test
    public void hasPedal(){
        assertEquals(true, piano.getPedal());
    }

    @Test
    public void canPlayMusic(){
        assertEquals("spoiiing", piano.playing("spoiiing"));
    }

    @Test
    public void canSellItem(){
        assertEquals(230.00, piano.calculateMarkUp(piano), 0.00);
    }
}
