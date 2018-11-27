import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TapeDeckTest {

    TapeDeck walkman;

    @Before
    public void before(){
        walkman = new TapeDeck("Sony", "Walkman");
    }

    @Test
    public void hasDetails(){
        assertEquals("Sony", walkman.getMake());
        assertEquals("Walkman", walkman.getModel());
    }

    @Test
    public void startsUnloaded(){
        assertEquals(true, walkman.hasSpace());
    }

    @Test
    public void canLoadTape(){
        walkman.addMedia();
        assertEquals(false, walkman.hasSpace());
    }

    @Test
    public void canUnloadTape(){
        walkman.ejectMedia();
        assertEquals(true, walkman.hasSpace());
    }

    @Test
    public void canPlayTape(){
        walkman.addMedia();
        assertEquals("Doo doo doo playing a song!", walkman.play());
    }

    @Test
    public void needsTapeToPlay(){
        assertEquals("Load a tape please!", walkman.play());
    }
}
