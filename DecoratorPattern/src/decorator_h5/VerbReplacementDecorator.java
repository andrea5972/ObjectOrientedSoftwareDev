package decorator_h5;

public class VerbReplacementDecorator implements MadLibsDecorator {
	
	public String[] verbsToUse;
	public int indexIntoArray;
	public MadLibsDecorator mlDecorator;
	
	public VerbReplacementDecorator(MadLibsDecorator ml) {
		verbsToUse = new String[] {"run", "smash", "jump", "dance",
				"yell","walk","hide","smile","dash","bump"};
		indexIntoArray = 0;
		this.mlDecorator = ml;		
	}
	
	@Override
	public String decorateString(String input) {
		String returnValue = mlDecorator.decorateString(input);
		
		while (returnValue.indexOf("<verb>") > -1) {
			returnValue = returnValue.replaceFirst("<verb>", verbsToUse[indexIntoArray]);
			indexIntoArray++;
			if (indexIntoArray == verbsToUse.length)
				indexIntoArray = 0;
		}
		
		return returnValue;
	}
}
