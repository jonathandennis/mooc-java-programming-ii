import java.util.ArrayList;


public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> maxWeightBox;
    
    public BoxWithMaxWeight(int capacity) {

        this.capacity = capacity;
        this.maxWeightBox = new ArrayList<>();
    }
    
    public int currentWeightOfMaxBox() {
        int sum = 0;
        for (Item item : this.maxWeightBox) {
            sum += item.getWeight();
        }
        return sum;
    }
    
    @Override
    public void add(Item item) {

        if(currentWeightOfMaxBox() + item.getWeight() > capacity) {
            return;
        }
            this.maxWeightBox.add(item);
    }           
    
    @Override
    public boolean isInBox(Item item) {
        return this.maxWeightBox.contains(item);
    }
}
