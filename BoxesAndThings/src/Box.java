import java.util.ArrayList;

public class Box implements ToBeStored {

	private double maxWeight;
    private double curWeight;
    private ArrayList<ToBeStored> things;
    
    public Box(double mw) {
        
        maxWeight = mw;
        things = new ArrayList<ToBeStored>();
    }
    
    public double weight() {
    	double curWeight = 0;
        for (ToBeStored thing : things) {
            curWeight += thing.weight();
        }
        return curWeight;
    }
    
    public void add(ToBeStored thing) {
        if (weight() + thing.weight() <= maxWeight) {
            things.add(thing);
        }
    }
    
    @Override
    public String toString() {
        return "Box: " + things.size() + " things, total weight " + weight() + " kg";
    }
	
}
