
public class World {
	//Builds the game world.
	//Returns the room the player starts in.
	public static Room buildWorld() {
		Room livingRoom = new Room("You are in the living room.");
		Room kitchen = new Room("You are in the kitchen.");
		Room kidsRoom = new Room ("You are in the kids Room.");
		Room restRoom = new Room ("You are in the rest room.");
		Room upstairsHall = new Room ("You are in the hallway.");
		Room masterBed = new Room ("you are now in the master bedroom");
		
		livingRoom.addExit(kitchen, 'e');//living room to kitchen
		kitchen.addExit(livingRoom,  'w');//kitchen to living room
		
		kidsRoom.addExit(livingRoom, 'e');//kids room to living room
		livingRoom.addExit(kidsRoom, 'w');//living room to kids room
		
		upstairsHall.addExit(livingRoom, 'd');//upstairs to living room
		livingRoom.addExit(upstairsHall, 'u');//living room to upstairs
		
		upstairsHall.addExit(masterBed, 'e');//upstairs hall to master bedroom
		masterBed.addExit(upstairsHall, 'w');//master bedroom to upstairs hall
		
		kitchen.addExit(restRoom, 's');//kitchen to restroom
		restRoom.addExit(kitchen, 'n');//restroom to kitchen
		return livingRoom;
	}

}
