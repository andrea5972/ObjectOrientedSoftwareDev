package decorator_h5;

public class RunHW5 {

	public static void main(String[] args) {

		 String s1 =
		            "Without precise <noun>s we could <verb> right "
		            + "though a <noun> or <verb> too close to a <noun>, and " 
		            + "that'd end you <noun> real quick, wouldn't it?";
		  
		 String s2 = 
	                "Honkey <noun>s and ancient <noun> are no <verb> "
	                + "for a good <noun> at your side, kid";
		 
		 MadLibsString mls = new MadLibsString(s1);
		 
		 VerbReplacementDecorator vrd = new VerbReplacementDecorator(mls);
		 NounReplacementDecorator nrd = new NounReplacementDecorator(vrd);
		 System.out.println(nrd.decorateString(s1));
		 
		 MadLibsString mls2 = new MadLibsString(s2);
		 vrd = new VerbReplacementDecorator(mls2);
		 nrd = new NounReplacementDecorator(vrd);
		 System.out.println(nrd.decorateString(s2));
		 
	}
	
}
