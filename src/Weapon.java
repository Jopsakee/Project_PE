import java.util.ArrayList;
import java.util.List;

public class Weapon extends Gear{
	private static List<Long> idWeaponList = new ArrayList<Long>();
	private int damage;
	private final int minDamage = 1;
	private int maxDamage = 100;
public Weapon(int weight, int damage, String image) {
	super(weight, image);
	if(damage > 0 && damage <= 100 && damage %7 == 0) {
		this.damage = damage;
	}
	else {
		throw new IllegalArgumentException("Weapon damage is not valid.");
	}
}
public long generateId() {
	long getal = 1;
	while(getal != 0 && getal %2 != 0 && getal %3 != 0) {
				getal = (long)(Math.random()*10000000L);
	}
		idWeaponList.add(getal);
		return getal;
	
}
public boolean isValidDamage(int damage) {
	if(damage > 0 && damage <= 100 && damage %7 == 0) {
		return true;
	}
	return false;
}
public int getDamage() {
	return damage;
}
public void setDamage(int damage) {
	if(this.isValidDamage(damage) == false)
		throw new IllegalArgumentException("Please enter a valid damage amount. Between 1 and 100 and dividable by 7.");
		this.damage = damage;
}

public int getMinDamage() {
	return minDamage;
}
public int getMaxDamage() {
	return maxDamage;
}
public void setMaxDamage(int maxDamage) {
	if(maxDamage<this.getMaxDamage())
		throw new IllegalArgumentException("The new maximum damage can not be lower than the initial value of 100.");
	this.maxDamage = maxDamage;
}
}