import java.util.ArrayList;
import java.util.List;

public class Gloves extends Armor {
    private static List<Long> idGlovesList = new ArrayList<Long>();
    private int actualArmor;

    public Gloves(int weight, String image) {
        super(weight, image);
        int min = 2;
        int max = 5;
        this.setActualArmor((int) (Math.floor(Math.random() * (max - min + 1) + min)));
    }

    public long generateId() {
        long getal = 10;
        while (this.isPrime(getal) == false) {
            getal = (long) (Math.random() * 10000000L);
        }
        idGlovesList.add(getal);
        return getal;
    }

    public boolean isPrime(long getal) {
        long temp;
        for (int i = 2; i <= getal / 2; i++) {
            temp = getal % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }

    public int getActualArmor() {
        return actualArmor;
    }

    public void setActualArmor(int actualArmor) {
        if (actualArmor < 0)
            throw new IllegalArgumentException("Armor can not be lower than 0 or higher than 100.");
        if (actualArmor > 100)
            throw new IllegalArgumentException("Armor can not be higher than 100.");
        this.actualArmor = actualArmor;
    }
}
