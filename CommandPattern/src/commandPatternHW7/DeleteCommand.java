package commandPatternHW7;

public class DeleteCommand implements GameCommandInterface   {

	private String myString; 
	
 	public DeleteCommand(String myString) {
 		this.myString = myString; 
 	}
 	
	@Override
	public void excecute() {
		ListofWords.getInstance().removeWord(myString);
		
	}

	@Override
	public void undo() {
		ListofWords.getInstance().addWord(myString);
		
	}

	@Override
	public void redo() {
		ListofWords.getInstance().removeWord(myString);
	}

}

