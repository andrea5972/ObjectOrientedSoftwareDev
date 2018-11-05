package commandPlayer;

import java.util.Random;

public class RunCommandPlayer {
	
	public static void main(String args[]) {
		CommandInvoker invoker = new CommandInvoker();

		Random randomGenerator = new Random();
		int direction;
		
		System.out.print("-------Initial ");
		Player.getInstance().printCoords();
		for (int i = 0; i < 50; i++) {
			direction = randomGenerator.nextInt(4) + 1;
			switch(direction) {
				case 1:
					MoveNorth moveNorth = new MoveNorth();
					invoker.setCommand(moveNorth);
					invoker.execute();
					break;
				case 2:
					MoveEast moveEast = new MoveEast();
					invoker.setCommand(moveEast);
					invoker.execute();
					break;
				case 3:
					MoveSouth moveSouth = new MoveSouth();
					invoker.setCommand(moveSouth);
					invoker.execute();
					break;
				case 4:
					MoveWest moveWest = new MoveWest();
					invoker.setCommand(moveWest);
					invoker.execute();
					break;
			}
			Player.getInstance().printCoords();
		}
		
		System.out.println("\nStarting Player undo\n");
	
		while (invoker.undo()) {
			Player.getInstance().printCoords();
		}
		System.out.print("-------Final ");
		Player.getInstance().printCoords();
	}
}
