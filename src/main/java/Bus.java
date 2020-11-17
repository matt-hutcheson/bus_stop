import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public String getDestination(){
        return this.destination;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int passengerCount(){
        return this.passengers.size();
    }

    public void addPerson(Person person) {
        if (this.passengerCount() < this.capacity) {
            this.passengers.add(person);
        }
    }

    public void removePassenger(Person person) {
        this.passengers.remove(person);
    }

    public void pickUp(BusStop busStop, Person person){
        this.addPerson(busStop.removeFromQueue(person));
    }
}


