public abstract class Gear {
private final int weight;
private final long idNo;
private Entity holder;
private String image;
public Gear(int weight, String image) {
	idNo =  generateId();
	this.setImage(image);
	if(weight < 0) {
		this.weight = 0;
	}
	else {
		this.weight = weight;
	}

}
public int getWeight() {
	return weight;
}

public long getIdNo() {
	return idNo;
}
public long generateId() {
	return 0;
}
public Entity getHolder() {
	return holder;
}
public void setHolder(Entity holder) {
	this.holder = holder;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
}
