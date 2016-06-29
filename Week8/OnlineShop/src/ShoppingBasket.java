import java.util.Map;
import java.util.HashMap;

public class ShoppingBasket {

private Map<String, Purchase> basket;
    
    public ShoppingBasket() {
        basket = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price) {
        Purchase purchase = new Purchase(product, 1, price);
        basket.put(product, purchase);
    }
    
    public int price() {
        int total = 0;

        for (Purchase purchase : basket.values()) {
            total += purchase.price();
        }
        return total;
    }
    
    public void print() {
        for (Purchase purchase : basket.values()) {
            System.out.println(purchase);
        }
    }
	
}
