
public class OnlineShop {

public static void main (String[] args) {
	
	Storehouse store = new Storehouse();
    store.addProduct("milk", 3, 10);
    store.addProduct("coffee", 5, 1);

    System.out.println("prices:");
    System.out.println("milk:  " + store.price("milk"));
    System.out.println("coffee:  " + store.price("coffee"));
    System.out.println("sugar: " + store.price("sugar"));
    
    System.out.println("stocks:");
    System.out.println("coffee:  " + store.stock("coffee"));
    System.out.println("sugar: " + store.stock("sugar"));

    System.out.println("we take a coffee " + store.take("coffee"));
    System.out.println("we take a coffee " + store.take("coffee"));
    System.out.println("we take sugar " + store.take("sugar"));

    System.out.println("stocks:");
    System.out.println("coffee:  " + store.stock("coffee"));
    System.out.println("sugar: " + store.stock("sugar"));
    
    System.out.println("products:");
    for (String product : store.products()) {
        System.out.println(product);
    }
	
}
	
}
