import java.util.ArrayList;

public class Box implements Packable {
    private double capacity;
    
    private ArrayList<Packable> items;
    
    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable item) {
        if (this.weight() + item.weight() > capacity) {
            return;
        }
        this.items.add(item);
    }
    
    @Override
    public double weight() {
        double kg = 0;
        for (Packable item : this.items) {
            kg += item.weight();
        }
        return kg;
    }
    
    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
}
