import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop busStop;
    private Person person;
    @Before
    public void before(){
        busStop = new BusStop("Balerno");
        person = new Person();
    }
    @Test
    public void busStopStartsEmpty(){
        assertEquals(0, this.busStop.getQueueCount());
    }
    @Test
    public void busStopHasName(){
        assertEquals("Balerno", this.busStop.getName());
    }
    @Test
    public void canAddPersonToBusStop(){
        this.busStop.addToQueue(person);
        assertEquals(1, this.busStop.getQueueCount());
    }
    @Test
    public void canRemovePersonFromQueue(){
        this.busStop.addToQueue(person);
        this.busStop.removeFromQueue(person);
        assertEquals(0, this.busStop.getQueueCount());
    }
}
