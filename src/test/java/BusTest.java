import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;

    @Before
    public void before() {
        bus = new Bus("Balerno", 80);
    }

    @Test
    public void hasDestination() {
        assertEquals("Balerno", bus.getDestination());
    }


}


