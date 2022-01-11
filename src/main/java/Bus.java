import java.util.ArrayList;

public class Bus {
    //Create a Bus class with a Destination, Capacity and an initially empty ArrayList passengers of type Person
    private String destination;
    private int capacity;
    private ArrayList<Passengers> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPassengers() {
        return passengers.size();
    }

    public void add(Passengers passenger) {
        if(this.passengers.size() < capacity) {
            this.passengers.add(passenger);
        }
    }

    public void removePassenger() {
        passengers.remove(0);
    }
}
