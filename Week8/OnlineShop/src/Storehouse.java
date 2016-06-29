import java.util.Map;
import java.util.HashMap;

public class Storehouse {

private Map<String, Integer> prices = new HashMap<String, Integer>();
    
    
    public void addProduct(String product, int price, int stock) {
        
        prices.put(product, price);
        
    }
    
    public int price(String product) {
        if (prices.get(product) == null) {
            return -99;
        } else {
            return prices.get(product);
        }
    }
	
}
