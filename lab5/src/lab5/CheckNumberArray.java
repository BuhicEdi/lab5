package lab5;

public class CheckNumberArray {

	private static final int MAX_ELEMENTS = 10;
	private int[] arrayOfInt;
	private int nbrOfElements;

	public CheckNumberArray() {
		this.arrayOfInt = new int[10];
	}

	public void addNbr(int value) {
		if (nbrOfElements < MAX_ELEMENTS) {
			this.arrayOfInt[nbrOfElements] = value;
			nbrOfElements++;
		}
	}

	public int getNbrOfElements() {
		return nbrOfElements;
	}

	public int getSum() {
		int valueSum = 0;

		for (int i = 0; i <= nbrOfElements; i++) {
			valueSum += arrayOfInt[i];
		}

		return valueSum;
	}

	public double getAverage() {
		double totalElements = nbrOfElements;

		return getSum() / totalElements;
	}

	public boolean isAllTheSame() {
		for (int i = nbrOfElements - 1; i > 0; i--) {
			if (arrayOfInt[i] != arrayOfInt[i - 1]) {
				return false;
			}
		}

		return true;
	}

	public boolean isAccOrder() {
		for (int i = nbrOfElements - 1; i > 0; i--) {
			if (arrayOfInt[i - 1] > arrayOfInt[i]) {
				return false;
			}
		}

		return true;
	}

	public boolean isDesOrder() {
		for (int i = 0; i < nbrOfElements - 1; i++) {
			if (arrayOfInt[i + 1] > arrayOfInt[i]) {
				return false;
			}
		}

		return true;
	}

	public boolean isOrdered() {
		if (isAccOrder() == true || isDesOrder() == true) {
			return true;
		} else {
			return false;
		}
	}
}