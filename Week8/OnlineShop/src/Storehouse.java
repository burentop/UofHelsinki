import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Storehouse {

	private Map<String, Integer> prices = new HashMap<String, Integer>();
    private Map<String, Integer> stockList = new HashMap<String, Integer>();
    
    public void addProduct(String product, int price, int stock) {
        
        prices.put(product, price);
        stockList.put(product, stock);
    }
    
    public int price(String product) {
        if (prices.get(product) == null) {
            return -99;
        } else {
            return prices.get(product);
        }
    }
    
    public int stock(String product) {
        if (stockList.get(product) == null) return 0;
        else return stockList.get(product);
    }
    
    public boolean take(String product) {
        if (stockList.containsKey(product)) {
            if (stockList.get(product) > 0) {
                int oldValue = stockList.get(product);
                stockList.put(product, oldValue - 1);
                return true;
            } else {
                return false;
            }
        } 
        return false;
    }
    
    public Set<String> products() {
        return prices.keySet();
    }
	
}
