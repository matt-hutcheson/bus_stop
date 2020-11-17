import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public int getQueueCount() {
        return this.queue.size();
    }

    public String getName(){
        return this.name;
    }

    public void addToQueue(Person person){
        this.queue.add(person);
    }

    public Person removeFromQueue(Person person){
        int index = this.queue.indexOf(person);
        Person personFound = this.queue.get(index);
        this.queue.remove(personFound);
        return personFound;
    }

}
