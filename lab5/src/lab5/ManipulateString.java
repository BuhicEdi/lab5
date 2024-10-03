package lab5;

import java.util.Random;

public class ManipulateString {

	private String str;

	public ManipulateString(String str) {
		this.str = str;
	}

	public String getString() {
		return str;
	}

	public String scramble() {
		String lastChar = str.substring(str.length() - 1, str.length());
		String scramStr = str.substring(1, str.length());
		String newStr = str.substring(0, 1);
		
		for (int i = scramStr.length(); i > 0; i--) {
			Random r = new Random();
			int ran = r.nextInt(0, scramStr.length());
			
			newStr += scramStr.charAt(ran);
			scramStr = scramStr.substring(0, ran) + scramStr.substring(ran + 1, scramStr.length());
			
		}
		
		return newStr += lastChar;
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
