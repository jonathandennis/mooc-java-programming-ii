import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    
    private Map<String, Item> itemsInCart;
    
    public ShoppingCart() {
        this.itemsInCart = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if(itemsInCart.keySet().contains(product)) {
            increaseQuantity(product);
        } else {
            this.itemsInCart.put(product, new Item(product, 1, price));
        }
    }
    
    public int price() {
        int total = 0;
        
        for(Item p : itemsInCart.values()) {
            total += p.price();
        }
        return total;
    }
    
    public void increaseQuantity(String product) {
        this.itemsInCart.get(product).increaseQuantity();
    }
    
    public void print() {
        for (Item p : itemsInCart.values())
        System.out.println(p.toString());
    }
}
