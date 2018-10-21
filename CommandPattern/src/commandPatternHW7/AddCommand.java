package commandPatternHW7;

public class AddCommand implements GameCommandInterface  {

 	private String myString; 
	
 	public AddCommand(String myString) {
 		this.myString = myString; 
 	}
 	
	@Override
	public void excecute() {
		ListofWords.getInstance().addWord(myString);
	}

	@Override
	public void undo() {
		ListofWords.getInstance().removeWord(myString);
			
	}

	@Override
	public void redo() {
		ListofWords.getInstance().addWord(myString);
	}

}
