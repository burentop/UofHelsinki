import java.util.ArrayList;

public class Box implements ToBeStored {

	private double maxWeight;
    private double curWeight;
    private ArrayList<ToBeStored> things;
    
    public Box(double mw) {
        curWeight = 0;
        maxWeight = mw;
        things = new ArrayList<ToBeStored>();
    }
    
    public double weight() {
        return curWeight;
    }
    
    public void add(ToBeStored thing) {
        if (curWeight + thing.weight() <= maxWeight) {
            things.add(thing);
            curWeight += thing.weight();
        }
    }
    
    @Override
    public String toString() {
        return "Box: " + things.size() + " things, total weight " + curWeight + " kg";
    }
	
}
