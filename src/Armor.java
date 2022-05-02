import java.util.ArrayList;
import java.util.List;

public class Armor extends Gear{
	private static List<Long> idArmorList = new ArrayList<Long>();
	private final int maxArmor = 100;
	private final int minArmor = 1;
	private int actualArmor;
public Armor(int weight, int actualArmor, String image) {
	super(weight, image);
	if(actualArmor > 0 && actualArmor <= 100) {
		this.actualArmor = actualArmor;
	}
	else {
		throw new IllegalArgumentException("Armor value is not valid.");
	}
}
public long generateId() {
	long getal = 10;
	while(this.isPrime(getal)==false) {
				getal = (long)(Math.random()*10000000L);
	}
		idArmorList.add(getal);
		return getal;
}
public boolean isPrime(long getal) {
	long temp;
	for(int i=2; i<=getal/2;i++) {
		temp = getal%i;
		if(temp == 0) {
			return false;
		}
	}
	return true;
}
public int getMaxArmor() {
	return maxArmor;
}
public int getMinArmor() {
	return minArmor;
}
public int getActualArmor() {
	return actualArmor;
}
public void setActualArmor(int actualArmor) {
	if(actualArmor < 0)
		throw new IllegalArgumentException("Armor can not be lower than 0 or higher than 100.");
	if(actualArmor > 100)
		throw new IllegalArgumentException("Armor can not be higher than 100.");
	this.actualArmor = actualArmor;
}
}
