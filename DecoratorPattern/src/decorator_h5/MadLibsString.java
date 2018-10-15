package decorator_h5;

public class MadLibsString implements MadLibsDecorator {
	
	public String MyString;
	
	public String getMadLibString() {
		return MyString;
	}
	
	@Override
	public String decorateString(String input) {
		return MyString;
	}
	
	public MadLibsString(String s1) {
		MyString = s1;
	}

}
