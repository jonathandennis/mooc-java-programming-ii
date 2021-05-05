
public class Container {
    
    private int contains;
    
    public Container() {
        this.contains = 0;
    }
    
    public int contains() {
        return contains;
    }
    
    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        
        this.contains += amount;
        if (this.contains > 100) {
            this.contains = 100;           
        }
    }
    
    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        this.contains -= amount;
            
        if (this.contains < 0) {
            this.contains = 0;
        }
    }
    
    @Override
    public String toString() {
        return this.contains + "/100";
    }
}
