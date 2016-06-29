
public class PublicService {

	public static void main(String[] args) {
        CivilService civil = new CivilService();
        MilitaryService military = new MilitaryService(756);
        
        System.out.println("Civil days left: " + civil.getDaysLeft());
        System.out.println("Military days left: " + military.getDaysLeft());
        
        civil.work();
        military.work();
        
        System.out.println("Civil days left: " + civil.getDaysLeft());
        System.out.println("Military days left: " + military.getDaysLeft());
        
    }
	
}
