
public class Room {
	private String description;
	private Room east;
	private Room west;
	private Room north;
	private Room south;
	private Room up;
	private Room down;
	
	public Room(String d) {
		description = d;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Room getExit(char direction) {
		
		if (direction == 'e') {
			return east;
		}
		if (direction == 'w') {
			return west;
		}
		if (direction == 'n') {
			return north;
		}
		if (direction == 's') {
			return south;
		}
		if (direction == 'u') {
			return up;
		}
		if (direction == 'd') {
			return down;
		}
		return null;
	}
	
	public void addExit(Room room, char direction) {
		if (direction == 'e') {
			east = room;
		}
		if (direction == 'w') {
			west = room;
		}
		if (direction == 'n') {
			north = room;
		}
		if (direction == 's') {
			south = room;
		}
		if (direction == 'u') {
			up = room;
		}
		if (direction == 'd') {
			down = room;
		}
	}
	public String toString() {
		return description;
	}

}
