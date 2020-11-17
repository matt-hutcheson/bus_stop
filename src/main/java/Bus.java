import javax.print.attribute.standard.Destination;
import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
//    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
    }

    public String getDestination(){
        return this.destination;
    }
}


