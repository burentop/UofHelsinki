
public class Book implements ToBeStored {

	private String writer;
    private String name;
    private double itemWeight;
    
    public Book(String wr, String n, double w) {
        writer = wr;
        name = n;
        itemWeight = w;
    }
    
    @Override
    public double weight() {
        return this.itemWeight;
    }
    
    @Override
    public String toString() {
        return this.writer + ": " + this.name;
    }
	
}
