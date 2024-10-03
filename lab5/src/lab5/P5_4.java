package lab5;
/**
 * Detta program testar klassen CheckString2
 * 
 * @author Edi Buhic
 * @version 2024-10-03
 */

public class P5_4 {
	
	public static void main(String[] args) {
		CheckString2 c = new CheckString2("Lorem Ipsum");
		
		System.out.println(c.getString());
		System.out.println(c.middle());
		System.out.println(c.countVowels());
		System.out.println(c.findString("Ipsum"));
		System.out.println(c.countWords());
	}
}
