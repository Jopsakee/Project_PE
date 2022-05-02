import java.util.ArrayList;
import java.util.List;

public class Backpack {
	private static List<Long> idBackpackList = new ArrayList<Long>();
	private List<Gear> backpackContentList = new ArrayList<Gear>();
	private final int capacity;

	public Backpack(int weight, int capacity) {
		this.capacity = capacity;
	}

	public long generateId() {
		long getal = (long) (Math.random() * 10000000L);
		while (idBackpackList.contains(getal)) {
			getal = (long) (Math.random() * 10000000L);
		}
		idBackpackList.add(getal);
		return getal;
	}

	public Gear searchItem(long idNo) {
		for (int i = 0; i < backpackContentList.size(); i++) {
			if (idNo == this.backpackContentList.get(i).getIdNo()) {
				return this.backpackContentList.get(i);
			}
		}
		return null;
	}

	public int getCurrentCapacity() {
		int capacity = 0;
		for (int i = 0; i < backpackContentList.size(); i++) {
			capacity += this.getBackpackContentList().get(i).getWeight();
		}

		return capacity;
	}

	public List<Gear> getBackpackContentList() {
		return backpackContentList;
	}

	public int getCapacity() {
		return capacity;
	}
}