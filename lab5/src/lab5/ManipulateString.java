package lab5;


public class ManipulateString {

	private String str;

	public ManipulateString(String str) {
		this.str = str;
	}

	public String getString() {
		return str;
	}

	public String scramble() {
		
		return null;

	} 
	
	public String reverse() {
		String strReversed = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			strReversed += str.charAt(i);
		}
		
		return strReversed;
	}
	
	public void insertAt(int pos, String strAdd) {
		
		String subStr = str.substring(pos, str.length());
		
		this.str = str.substring(0, pos);
		this.str += strAdd;
		this.str += subStr;
	}
	
	public char removeCharAt(int pos) {
		String newStr;
		char delChar;
		
		delChar = str.charAt(pos);
		
		newStr = str.substring(0, pos);
		newStr += str.substring(pos + 1, str.length());

		this.str = newStr;
		return delChar;
	}
	
	
	
	
}
