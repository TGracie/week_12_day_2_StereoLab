import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cd;

    @Before
    public void before(){
        cd = new CDPlayer("Denon", "G5", 4);
    }

    @Test
    public void hasDetails(){
        assertEquals("Denon", cd.getMake());
        assertEquals("G5", cd.getModel());
        assertEquals(4, cd.getCapacity());
    }

    @Test
    public void canAddDiscs(){
        cd.addMedia();
        cd.addMedia();
        cd.addMedia();
        assertEquals(1, cd.spaceLeft());
        cd.addMedia();
        assertEquals(0, cd.spaceLeft());
    }

    @Test
    public void canEjectDiscs(){
        cd.addMedia();
        cd.addMedia();
        cd.addMedia();
        assertEquals(1, cd.spaceLeft());
        cd.ejectMedia();
        cd.ejectMedia();
        assertEquals(3, cd.spaceLeft());
    }
}
