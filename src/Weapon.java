import java.util.ArrayList;
import java.util.List;

public class Weapon extends Gear {
	private static List<Long> idWeaponList = new ArrayList<Long>();
	private int damage;

	public Weapon(int weight, String image) {
		super(weight, image);
		int min = 3;
		int max = 15;
		this.setDamage((int) (Math.floor(Math.random() * (max - min + 1) + min)));
	}

	public long generateId() {
		long getal = 1;
		while (getal != 0 && getal % 2 != 0 && getal % 3 != 0) {
			getal = (long) (Math.random() * 10000000L);
		}
		idWeaponList.add(getal);
		return getal;

	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
}