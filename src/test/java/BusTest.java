import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Balerno", 5);
        person = new Person();
        busStop = new BusStop("Princes Street");
    }

    @Test
    public void hasDestination() {
        assertEquals("Balerno", bus.getDestination());
    }

    @Test
    public void hasCapacity() {
        assertEquals(5, bus.getCapacity());
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPerson() {
        this.bus.addPerson(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canOnlyAddPassengersIfBelowCapacity() {
        this.bus.addPerson(person);
        this.bus.addPerson(person);
        this.bus.addPerson(person);
        this.bus.addPerson(person);
        this.bus.addPerson(person);
        this.bus.addPerson(person);
        assertEquals(5, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        this.bus.addPerson(person);
        this.bus.removePassenger(person);
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canPickupFromBusStop(){
        this.busStop.addToQueue(person);
        this.bus.pickUp(busStop, person);
        assertEquals(0, this.busStop.getQueueCount());
        assertEquals(1, this.bus.passengerCount());
    }


}


