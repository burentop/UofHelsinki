
public class MilitaryService implements NationalService {
    
    private int daysLeft;
    
    public MilitaryService(int days) {
        daysLeft = days;
    }
    
    @Override
    public int getDaysLeft() {
        return this.daysLeft;
    }
    
    @Override
    public void work() {
        if (daysLeft > 0) this.daysLeft -= 1;
    }
    
}