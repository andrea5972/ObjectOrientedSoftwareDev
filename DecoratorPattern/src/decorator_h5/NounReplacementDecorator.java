package decorator_h5;

public class NounReplacementDecorator implements MadLibsDecorator {
	
	public String[] nounsToUse;
	public int indexIntoArray;
	public MadLibsDecorator mlDecorator;
	
	public NounReplacementDecorator(MadLibsDecorator ml) {
		nounsToUse = new String[] {"hotdog", "apple", "teacher", "homework",
			"boyfriend","eggs","pen","moon","dog","cat"};
		indexIntoArray = 0;
		this.mlDecorator = ml;		
	}
	
	@Override
	public String decorateString(String input) {
		String returnValue = mlDecorator.decorateString(input);
		
		while (returnValue.indexOf("<noun>") > -1) {
			returnValue = returnValue.replaceFirst("<noun>", nounsToUse[indexIntoArray]);
			indexIntoArray++;
			if (indexIntoArray == nounsToUse.length)
				indexIntoArray = 0;
		}
		
		return returnValue;
	}
}
