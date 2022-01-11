import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Passengers passengers;

    @Before
    public void before() {
        bus = new Bus("Edinburgh", 50);
        passengers = new Passengers();
    }

    @Test
    public void hasDestination() {
        assertEquals("Edinburgh", bus.getDestination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(50, bus.getCapacity());
    }

    @Test
    public void canCheckNumberOfPassengers(){
        assertEquals(0, bus.getPassengers());
    }

    //Create a method to add a passenger onto the bus only if the passenger count is less than the capacity.

    @Test
    public void addPassenger(){
        bus.add(passengers);
        assertEquals(1, bus.getPassengers());

    }

    @Test
    public void busOverCapacity() {
        Bus bus = new Bus("Edinburgh", 0);
        bus.add(passengers);
        assertEquals(0, bus.getPassengers());
    }
    //Create a method to remove a passenger from the bus.

    @Test
    //Create a method to remove a passenger from the bus.
    public void canRemovePassenger(){
        bus.add(passengers);
        bus.removePassenger();
        assertEquals(0, bus.getPassengers());
    }

    //Create a pickUp method in bus that gets person from bus stop and adds to bus passengers.
    @Test
    public void pickUpFromBusStop() {
        
    bus.add(passengers);
    }
}
