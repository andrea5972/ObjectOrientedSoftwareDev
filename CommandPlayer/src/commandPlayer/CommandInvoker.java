package commandPlayer;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {

	private List<CommandInterface> commandList;
	int index;
	
	public CommandInvoker() {
		commandList = new ArrayList<>();
		index = -1;
	}
	
	public void setCommand(CommandInterface cmd) {
		commandList.add(cmd);
		index++;
	}
	
	public void execute() {
		System.out.print("executing move " + (index + 1) + " ");
		commandList.get(index).move();	
	}
	public boolean undo() {
		if (index < 0)
			return false;
		System.out.print("Undo move " + (index + 1) + " ");
		commandList.get(index).undo();	
		index--;
		return true;
	}
	
	public void clearCommandList() {
		commandList.clear();
		index = -1;
	}

}
