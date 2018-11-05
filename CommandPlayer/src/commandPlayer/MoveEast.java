package commandPlayer;

public class MoveEast implements CommandInterface {

	@Override
	public void move() {
		int x = Player.getInstance().getX();
		Player.getInstance().setX(x + 1);
	}

	@Override
	public void undo() {
		int x = Player.getInstance().getX();
		Player.getInstance().setX(x - 1);
	}	

}
