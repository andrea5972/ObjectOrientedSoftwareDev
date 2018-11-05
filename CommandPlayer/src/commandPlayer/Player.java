//Singleton Class

package commandPlayer;

public class Player {
	
	private int x;
	private int y;
	private static Player instance;
	
	private Player() {
		x = 0;
		y = 0;
	}
	
	public static Player getInstance() {
		if (instance == null)
			instance = new Player();
		return instance;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void printCoords() {
		System.out.println("Player move: X: " + x + ", Y: " + y);
	}

}
