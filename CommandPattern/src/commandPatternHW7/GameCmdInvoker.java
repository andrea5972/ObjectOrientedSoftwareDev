package commandPatternHW7;

import java.util.ArrayList;
import java.util.List;

public class GameCmdInvoker {
	
	private List<GameCommandInterface> cmdList;
	private int index;
	
	
	public GameCmdInvoker() {
		cmdList= new ArrayList<>();
		index = -1;
	}
	
	
	public void setCommand(GameCommandInterface gci) {
		this.cmdList.add(gci);
		index++;
		
	}

	public void undo() {
		this.cmdList.get(index).undo();
		
	}

	public void redo() {
		this.cmdList.get(index).redo();
		
	}
	
	public void execute() {
		this.cmdList.get(index).excecute();
	}

}
