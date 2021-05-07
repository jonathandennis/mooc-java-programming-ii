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
        double maxVal = 0.0;
        
        if (amountHistory.isEmpty()) {
            return maxVal;
        }
        
        for(Double amount : amountHistory) {
            if (amount > maxVal) {
                maxVal = amount;
            }
        }
        return maxVal;
    }
    
    public double minValue() {
        double minVal = 1000.0;
        
        if (amountHistory.isEmpty()) {
            return 0.0;
        }
        
        for(Double amount : amountHistory) {
            if (amount < minVal) {
                minVal = amount;
            }
        }
        return minVal;
    }
    
    public double average() {
        double sumAmounts = 0.0;
        int count = 0;
        
        if (amountHistory.isEmpty()) {
            return sumAmounts;
        }
        
        for(Double amount : amountHistory) {
            sumAmounts += amount;
            count++;
        }
        return sumAmounts / count;
    }
    
    @Override
    public String toString() {
        return amountHistory.toString();
    }
}
