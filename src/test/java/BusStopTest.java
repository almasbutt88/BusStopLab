import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

   private Passengers passengers;
   private Bus bus;
   private BusStop busStop;

   @Before
    public void before(){
       bus = new Bus("Edinburgh", 50);
       busStop = new BusStop("Lothian Road");
       passengers = new Passengers();
   }
   @Test
    public void canAddToQueue() {
       busStop.add(passengers);
       assertEquals(1, busStop.getQueue());
   }

   @Test
    public void canRemoveFromQueue(){
       busStop.add(passengers);
       busStop.remove(passengers);
       assertEquals(0, busStop.getQueue());
   }





}
