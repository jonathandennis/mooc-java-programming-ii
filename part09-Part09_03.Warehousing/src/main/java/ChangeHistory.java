import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> amountHistory;
    
    public ChangeHistory() {
        this.amountHistory = new ArrayList<>();
    }
    
    public void add(double status) {
        this.amountHistory.add(status);
    }
    
    public void clear() {
        this.amountHistory.clear();
    }
    
    public double maxValue() {
        double maxVal = this.amountHistory.get(0);

        for(Double amount : this.amountHistory) {
            if (maxVal < amount) {
                maxVal = amount;
            }
        }
        return maxVal;
    }
    
    public double minValue() {
        double minVal = this.amountHistory.get(0);
        
        for (Double amount : this.amountHistory) {
            if (minVal > amount) {
                minVal = amount;
            }
        }
        return minVal;
    }
    
    public double average() {

        if (this.amountHistory.isEmpty()) {
            return 0;
        }
        
        double sumAmounts = 0;
        for(Double amount : this.amountHistory) {
            sumAmounts += amount;
        }
        return sumAmounts / this.amountHistory.size();
    }
    
    @Override
    public String toString() {
        return amountHistory.toString();
    }
}
