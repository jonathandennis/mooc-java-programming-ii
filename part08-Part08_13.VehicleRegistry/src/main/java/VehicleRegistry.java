import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners;
    
    public VehicleRegistry() {
        owners = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (owners.containsKey(licensePlate)) {
            return false;
        }
        owners.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        return owners.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (!owners.containsKey(licensePlate)) {
            return false;
        }
        owners.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates() {
        for (LicensePlate licensePlate : owners.keySet()) {
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> ownersList = new ArrayList<>();
        
        for (String owner : this.owners.values()) {
            if (ownersList.contains(owner)) {
                continue;
            }
            System.out.println(owner);
            ownersList.add(owner);
        }
    }
}
