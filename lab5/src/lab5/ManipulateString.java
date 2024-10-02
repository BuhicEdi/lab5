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
}
