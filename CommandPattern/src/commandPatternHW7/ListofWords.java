/* Singleton 
 * 
 */


package commandPatternHW7;

import java.util.ArrayList;
import java.util.List;

public class ListofWords {

	private List<String> listOfWords;
	private static ListofWords instance;
	
	
	private ListofWords(){
		listOfWords = new ArrayList<String>();
		
	}
	
	public static ListofWords getInstance() {
		
		if (instance == null)
			instance = new ListofWords();
		
		return instance;
	}
	
	public void addWord(String myString) {
		this.listOfWords.add(myString);
		
	}
	
	public void removeWord(String myString) {
		this.listOfWords.remove(myString);
	}
	
	public String toString() {
		
		return this.listOfWords.toString();
		
	}

}
