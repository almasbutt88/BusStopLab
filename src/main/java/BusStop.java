import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Passengers> queue;

    public BusStop(String busStopName) {
        this.name = busStopName;
        this.queue = new ArrayList<>();
    }

    public void add(Passengers passengers) {
        this.queue.add(passengers);
    }

    public void remove(Passengers passengers) {
        this.queue.remove(passengers);
    }

    public int getQueue() {
        return queue.size();
    }
}
