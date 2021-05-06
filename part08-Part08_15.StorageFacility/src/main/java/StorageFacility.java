import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageUnit;
    
    public StorageFacility() {
        this.storageUnit = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.storageUnit.putIfAbsent(unit, new ArrayList<>());       
        this.storageUnit.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String unit) {
        return this.storageUnit.getOrDefault(unit, new ArrayList<>());
    }
    
    public void remove(String unit, String item) {
        this.storageUnit.get(unit).remove(item);
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> allUnits = new ArrayList<>();
        
        for (String unit : storageUnit.keySet()) {
            if (storageUnit.get(unit).isEmpty()) {
                continue;
            }
            allUnits.add(unit);
        }
        return allUnits;
    }
}
