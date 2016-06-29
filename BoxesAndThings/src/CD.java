
public class CD implements ToBeStored {

	private String artist;
    private String title;
    private int year;
    private double itemWeight;
    
    public CD(String a, String t, int y) {
        artist = a;
        title = t;
        year = y;
        itemWeight = 0.1;
    }
    
    @Override
    public double weight() {
        return this.itemWeight;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.title + " (" + this.year + ")";
    }
	
}
