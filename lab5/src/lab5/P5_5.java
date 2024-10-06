package lab5;
/**
 * Detta program testar klassen ManipulateString
 * 
 * @author Edi Buhic
 * @version 2024-10-03
 */

public class P5_5 {

	public static void main(String[] args) {
		ManipulateString manStr = new ManipulateString("Lorem Ipsum");

		System.out.println(manStr.getString());
		System.out.println(manStr.scramble());
		System.out.println(manStr.reverse());
		manStr.insertAt(4, "ASDF");
		System.out.println(manStr.getString());
		System.out.println(manStr.removeCharAt(3));
	}
}
