
public class Game {
		public static void main(String[] args) {
			Room currentRoom = World.buildWorld();
			
			System.out.println(currentRoom);
			
			System.out.println("\nNow we'll move east!");//goes to the kitchen
			currentRoom = currentRoom.getExit('e');
			
			System.out.println(currentRoom);
			
			
			System.out.println("\nNow we'll move west!");//goes back to the living room
			currentRoom = currentRoom.getExit('w');
			
			System.out.println(currentRoom);
			
			System.out.println("\nNow we'll move west!");//goes to the kids room
			currentRoom = currentRoom.getExit('w');
			
			System.out.println(currentRoom);
			
			System.out.println("\nNow we'll move east!");//goes back to the living room
			currentRoom = currentRoom.getExit('e');
			
			System.out.println(currentRoom);
			

		}
	}


