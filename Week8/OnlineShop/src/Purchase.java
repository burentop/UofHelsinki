
public class Purchase {

	private String product;
    private int amount;
    private int unitPrice;
    
    public Purchase(String p, int a, int price) {
        product = p;
        amount = a;
        unitPrice = price;
    }
    
    public int price() {
        return amount * unitPrice;
    }
    
    public void increaseAmount() {
        amount++;
    }
    
    public String toString() {
        return product + ": " + amount;
    }
	
}
