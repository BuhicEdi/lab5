package lab5;

public class CheckString2 {

	private String str;

	public CheckString2(String str) {
		this.str = str;
	}

	public String getString() {
		return str;
	}

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

	public int findString(String strSearch) {		 
		for(int i = 0; (i + strSearch.length()) <= str.length(); i++) {
			if (strSearch.contains(str.substring(i, (i + strSearch.length())))) {
				return str.indexOf(strSearch);
			}
		}

		return -1;
	}

	public int countWords() {
		int wordCount = 1;

		if (str.length() == 0) {
			return 0;
		}

		for (int i = 0; i < (str.length() - 1); i++) {
			if (str.substring(i, i + 1).isBlank() && str.substring(i, i + 2).isEmpty() == false) {
				wordCount++;
			}
		}
		
		if (str.substring(0, 1).isBlank() || str.substring(str.length()-1, str.length()).isBlank()) {
			wordCount--;
		}
		

		return wordCount;
	}
}