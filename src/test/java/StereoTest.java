import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    CDPlayer cd;
    TapeDeck tape;

    @Before
    public void before(){
        cd = new CDPlayer("Denon", "G5", 2);
        tape = new TapeDeck("Sony", "Stereomaster");
        stereo = new Stereo();
    }

    @Test
    public void needsComponents(){
        stereo.setCDPlayer(cd);
        assertEquals(true, stereo.hasCDPlayer());
        assertEquals(false, stereo.hasTapeDeck());
    }

    @Test
    public void getTapeDeck(){
        stereo.setTapeDeck(tape);
        assertEquals(tape, stereo.getTapeDeck());
    }
}
