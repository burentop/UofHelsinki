import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;

public class VehicleRegister {
	
	private HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();

public boolean add (RegistrationPlate plate, String owner) {
		
		if (owners.get(plate) == null) {
			owners.put(plate, owner);
			return true;
		}
		return false;
		
	}
	
	public String get (RegistrationPlate plate) {
		if (owners.get(plate) != null) {
			return owners.get(plate);
		}
		return null;
	}
	
	public boolean delete (RegistrationPlate plate) {
		if (owners.get(plate) != null) {
			owners.remove(plate);
			return true;
		}
		return false;
	}
	
	public void printRegistrationPlates () {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> tempArray = new ArrayList<String>();
        for (RegistrationPlate plate : owners.keySet()) {
            if (!tempArray.contains(owners.get(plate))) {
                tempArray.add(owners.get(plate));
            }
        }
        
        Iterator<String> itr = tempArray.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element);
        }
    }
	
}
