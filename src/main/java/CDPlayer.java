import java.sql.SQLOutput;

public class CDPlayer extends Component {

    private int capacity;
    private int counter;

    public CDPlayer(String make, String model, int capacity){
        super(make, model);
        this.capacity = capacity;
        this.counter = 0;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void addMedia(){
        if (counter < this.capacity){
            counter += 1;
        }
    }

    public void ejectMedia(){
        if (counter > 0){
            counter -= 1;
        }
    }

    public int spaceLeft(){
        return (this.capacity - this.counter);
    }
}
