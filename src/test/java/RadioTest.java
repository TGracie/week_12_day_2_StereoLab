import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio rad;

    @Before
    public void before(){
        rad = new Radio();
    }

    @Test
    public void canTuneRadio(){
        assertEquals("Tuning to station", rad.tune());
    }
}
