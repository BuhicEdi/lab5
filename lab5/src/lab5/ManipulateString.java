package lab5;

import java.util.Random;
/**
 * Klass som tar emot en sträng och erbjuder olika sätt att manipulera den på som t.ex slumpa om ordningen, skriva ut den spegelvänt, addera nya ord etc.
 * 
 * @author Edi Buhic
 * @version 2024-10-03
 */


public class ManipulateString {

	// Klassattribut som lagrar inmatade strängen
	private String str;

	// Konstruktor som tar emot en sträng och lagrar den
	public ManipulateString(String str) {
		this.str = str;
	}

	// Metod som returnerar strängen i sin dåvarande form
	public String getString() {
		return str;
	}

	// Metod som tar alla bokstäver förutom den första och sist för att sedan byta plats på de i slumpmässig ordning
	public String scramble() {
		String lastChar;
		String scramStr;
		String newStr;

		if (str.length() <= 2 || str.isBlank()) {
			return str;
		} else {
			lastChar = str.substring(str.length() - 1, str.length());
			scramStr = str.substring(1, str.length() - 1);
			newStr = str.substring(0, 1);
		}

		for (int i = scramStr.length(); i > 0; i--) {
			Random r = new Random();
			int ran = r.nextInt(0, scramStr.length());

			newStr += scramStr.charAt(ran);
			scramStr = scramStr.substring(0, ran) + scramStr.substring(ran + 1, scramStr.length());
		}	
		return newStr += lastChar;
	} 

	// Metod som returnerar strängen i spegelvänd ordning
	public String reverse() {
		String strReversed = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			strReversed += str.charAt(i);
		}
		return strReversed;
	}

	// Metod som tar emot ett ord som den sedan adderar ordet i huvudsträngen på den index som användaren bestämmer
	public void insertAt(int pos, String strAdd) {

		String subStr = str.substring(pos, str.length());

		this.str = str.substring(0, pos);
		this.str += strAdd;
		this.str += subStr;
	}

	// Metod som tar emot en position och plockar sedan bort bokstaven samt returnerar den på vald position
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
