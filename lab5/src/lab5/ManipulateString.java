package lab5;


public class ManipulateString {

	private String str;

	public ManipulateString(String str) {
		this.str = str;
	}

	public String getString() {
		return str;
	}

 /*	public String scramble() {
		String strCpy = str;
		String scrambledStr;
		
		for (int i = str.length(); i <= 0; i--) {
			Random r = new Random();
			int ran = r.nextInt(1, i);
			
			scrambledStr = strCpy.substring(ran, ran-1);
			return null;
			
			
		}

	} 
*/
	
	public String reverse() {
		String strReversed = null;
		
		for (int i = str.length(); i >= 0; i--) {
			strReversed += str.charAt(i);
		}
		
		return strReversed;
	}
	
	public void insertAt(int pos, String strAdd) {
		
		this.str = str.substring(0, pos);
		this.str += strAdd;
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
