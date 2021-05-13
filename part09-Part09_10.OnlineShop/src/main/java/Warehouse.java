import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> productPrices;
    private Map<String, Integer> productStock;
    
    public Warehouse() {
        this.productPrices = new HashMap<>();
        this.productStock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.productPrices.put(product, price);
        this.productStock.put(product, stock);
    }
    
    public int stock(String product) {
        return this.productStock.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        if(stock(product) == 0) {
            return false;
        }
        this.productStock.put(product, productStock.get(product) - 1);
        return true;
    }
    
    public int price(String product) {        
        return this.productPrices.getOrDefault(product, -99);
    }
    
    public Set<String> products() {
        Set<String> products = productStock.keySet();
        return products;
    }
}
