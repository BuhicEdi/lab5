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
		String[] wordSplit;
		int wordCount;

		wordSplit = str.split("\s");
		wordCount = wordSplit.length;

		for (int i = 0; i < (wordSplit.length - 1); i++) {
			if (str == "") {
				return 0;
			} else if( wordSplit[i] == "\s" && wordSplit[i + 1] == "\s") {
				wordCount--;
			}
		}
		
		return wordCount;
		
		
	}
}