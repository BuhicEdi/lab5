package lab5;
/**
 * Klass som tar emot en sträng och kan utföra saker som att räkna vokaler, returnera mittersta bokstaven, räkna ord etc.
 * 
 * @author Edi Buhic
 * @version 2024-10-03
 */

public class CheckString2 {

	// Klassattribut som lagrar strängen
	private String str;
	
	// Konstruktor som tar emot en sträng och lagrar den
	public CheckString2(String str) {
		this.str = str;
	}

	// Metod som returnerar strängen
	public String getString() {
		return str;
	}

	// Metod som plockar ut mittersta bokstaven/bokstäverna och returnerar
	public String middle() {
		String midStr = "";
		if(str.length() != 0) {
			if (str.length() %2 == 0) {
				midStr = str.substring((str.length()/2 - 1), (str.length()/2) + 1);
			} else {
				midStr = str.substring((str.length()/2), (str.length()/2) + 1);
			}
		}
		return midStr;
	}

	// Metod som räknar antalet vokaler
	public int countVowels() {
		int voCount = 0;
		String vowels = "aoueiyåäöAOUEIYÅÄÖ";

		for (int i = 0; i < str.length(); i++) {
			if (vowels.contains(str.substring(i, i + 1))) {
				voCount++;
			}
		}
		return voCount;
	}

	// Metod som tar emot en delsträng och kontrollerar ifall den finns i huvudsträngen samt i vilket index
	public int findString(String strSearch) {		 
		for(int i = 0; (i + strSearch.length()) <= str.length(); i++) {
			if (strSearch.contains(str.substring(i, (i + strSearch.length())))) {
				return str.indexOf(strSearch);
			}
		}
		return -1;
	}

	// Metod som räknar och returnerar antalet ord
	public int countWords() {
		String[] wordSplit;
		int wordCount = 0;

		wordSplit = str.split("\s");

		if (str.isEmpty() == false) {
			wordCount = wordSplit.length;
		} else {
			return wordCount;
		}

		for (int i = 0; i <= (wordSplit.length - 1); i++) {
			System.out.println("i: " + wordSplit[i]); 
			if (wordSplit[i] == "") {
				wordCount--;
			}
		} 
		return wordCount;
	}
}