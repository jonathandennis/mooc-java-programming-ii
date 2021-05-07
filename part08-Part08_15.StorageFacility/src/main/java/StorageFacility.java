import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageUnits;
    
    public StorageFacility() {
        this.storageUnits = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.storageUnits.putIfAbsent(unit, new ArrayList<>());       
        this.storageUnits.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String unit) {
        return this.storageUnits.getOrDefault(unit, new ArrayList<>());
    }
    
    public void remove(String unit, String item) {
        if (!this.storageUnits.containsKey(unit)) {
            return;
        }
        
        this.storageUnits.get(unit).remove(item);
        
        if(this.storageUnits.get(unit).isEmpty()) {
            this.storageUnits.remove(unit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> allUnits = new ArrayList<>();        
        for (String unit : this.storageUnits.keySet()) {           
            allUnits.add(unit);
        }
        return allUnits;
    }
}
