import java.util.HashMap;

public abstract class Entity {
	private String name;
	private int eHitPoints;
	private int hitpoints;
	private double averageStrength = 10.00;
	private double strength;
	private int capacity;
	private int protection;
	private String image;

	public Entity(String name, int hitpoints, double strength, String image) {
		this.setName(name);
		this.setHitpoints(hitpoints);
		this.seteHitPoints(hitpoints);
		this.setStrength(strength);
		this.calculateCapacity(strength);
		this.setCapacity();
		this.setImage(image);
		if (strength == 0) {
			strength = this.averageStrength;
		}
	}

	public boolean isValidName(String name) {
		return name.matches("[A-Z]{1}[A-Za-z\\s]*[']?[A-Za-z\\s]*[']?[A-Za-z\\s]*");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.isValidName(name);
		if (this.isValidName(name) == false)
			throw new IllegalArgumentException("Incorrect name.");
		if (name == "")
			throw new IllegalArgumentException("Please fill in your name.");
		if (name == null)
			throw new IllegalArgumentException("Please fill in your name.");
		this.name = name;
	}

	public HashMap<AnchorM, Gear> getMonsterHashmap() {
		return null;
	}

	public HashMap<Anchor, Gear> getHashmap() {
		return null;
	}

	public int geteHitPoints() {
		return eHitPoints;
	}

	public void seteHitPoints(int eHitPoints) {
		if (this.eHitPoints > hitpoints) {
			this.eHitPoints = hitpoints;
		}
		this.eHitPoints = eHitPoints;
	}

	public int getHitpoints() {
		return hitpoints;
	}

	public void setHitpoints(int hitpoints) {
		if (hitpoints <= 0)
			throw new IllegalArgumentException("Please fill in a positive hitpoint amount.");
		this.hitpoints = hitpoints;
	}

	public double getAverageStrength() {
		return averageStrength;
	}

	public double getStrength() {
		return strength;
	}

	public void setStrength(double strength) {
		double tempStrength = Math.round(strength);
		if (strength != tempStrength)
			throw new IllegalArgumentException("Please insert a round number as strength amount.");
		if (strength < 0)
			throw new IllegalArgumentException("Please fill in a positive strength amount.");
		this.strength = strength;
	}

	public int calculateCapacity(double strength) {
		return 0;
	}

	public int getCurrentCapacity() {
		return 0;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity() {
		this.capacity = calculateCapacity(this.getStrength());
	}

	public int getProtection() {
		return 0;
	}

	public void setProtection(int protection) {
		if (protection < 0)
			throw new IllegalArgumentException("Please fill in a strictly positive value for hero protection.");
		this.protection = protection;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
