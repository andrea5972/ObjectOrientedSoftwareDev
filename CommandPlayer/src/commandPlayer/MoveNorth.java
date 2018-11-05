package commandPlayer;

public class MoveNorth implements CommandInterface {

	@Override
	public void move() {
		int y = Player.getInstance().getY();
		Player.getInstance().setY(y + 1);
	}
	
	@Override
	public void undo() {
		int y = Player.getInstance().getY();
		Player.getInstance().setY(y - 1);
	}

}
