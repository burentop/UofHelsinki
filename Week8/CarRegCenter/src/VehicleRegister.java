import java.util.HashMap;
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
	
}
