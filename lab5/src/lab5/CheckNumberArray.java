package lab5;
/**
 * Klass som lagrar en array av heltal som sedan kan returnera saker som antal element, summa, ifall de är stigande/fallende etc.
 * 
 * @author Edi Buhic
 * @version 2024-10-03
 */

public class CheckNumberArray {

	// Klassattribut som lagrar antal element, själva arrayen samt arrayens maxstorlek
	private static final int MAX_ELEMENTS = 10;
	private int[] arrayOfInt;
	private int nbrOfElements = 0;

	// Konstruktor som genererar en ny array med maxantalet platser
	public CheckNumberArray() {
		this.arrayOfInt = new int [MAX_ELEMENTS];
	}

	// Metod som tar emot och adderar ett nytt tal i arrayen (i mån av plats)
	public void addNbr(int value) {
		if (nbrOfElements < MAX_ELEMENTS) {
			this.arrayOfInt[nbrOfElements] = value;
			nbrOfElements++;
		}
	}

	// Metod som returnerar antalet element
	public int getNbrOfElements() {
		return nbrOfElements;
	}

	// Metod som beräknar samt returnerar summan av alla element
	public int getSum() {
		int valueSum = 0;

		for (int i = 0; i <= nbrOfElements; i++) {
			valueSum += arrayOfInt[i];
		}
		return valueSum;
	}

	// Metod som beräknar samt returnerar medelvärdet av alla element
	public double getAverage() {
		if (nbrOfElements == 0) {
			return 0;
		}
		return (double) getSum() / nbrOfElements;
	}

	// Metod som kontrollerar ifall alla element är samma värde
	public boolean isAllTheSame() {
		for (int i = nbrOfElements - 1; i > 0; i--) {
			if (arrayOfInt[i] != arrayOfInt[i - 1]) {
				return false;
			}
		}

		return true;
	}

	// Metod som kontrollerar ifall elementen är i stigande ordning
	public boolean isAccOrder() {
		for (int i = nbrOfElements - 1; i > 0; i--) {
			if (arrayOfInt[i - 1] > arrayOfInt[i]) {
				return false;
			}
		}
		return true;
	}

	// Metod som kontrollerar ifall elementen är i fallande ordning
	public boolean isDesOrder() {
		for (int i = 0; i < nbrOfElements - 1; i++) {
			if (arrayOfInt[i + 1] > arrayOfInt[i]) {
				return false;
			}
		}
		return true;
	}

	// Metod som kontrollerar ifall elementen är i någon ordning
	public boolean isOrdered() {
		if (isAccOrder() == true || isDesOrder() == true) {
			return true;
		} else {
			return false;
		}
	}
}