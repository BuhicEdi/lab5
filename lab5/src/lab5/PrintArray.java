package lab5;

import java.util.Random;

public class PrintArray {

	private int[] arrayOfInt = new int[10];


	public PrintArray() {
		Random r = new Random();

		for (int i = 0; i < arrayOfInt.length; i++) {
			this.arrayOfInt[i] = r.nextInt(1, 10);
		}
	}


	public void printEvenIndex() {
		for (int i = 0; i < arrayOfInt.length; i=i+2) {
			System.out.println(arrayOfInt[i]);
		} 
	}

	public void printEvenElement() {
		for (int elementIndex: arrayOfInt) {
			int value = elementIndex;

			while (elementIndex > 0) {
				value = value - 2;
			}

			if (value == 0) {
				System.out.println(arrayOfInt[elementIndex]);
			}									
		}
	}

//	public void printReverse() {
//		for (int i = arrayOfInt.length - 1; i >= 0; i--) {
//			System.out.println(arrayOfInt[i]);
//		}
//	}

	public void printFirstAndLast() {
		int first = 0;
		int last = arrayOfInt.length - 1;

		System.out.println(arrayOfInt[first]);
		System.out.println(arrayOfInt[last]);
	}

	public int[] getArray() {
		return arrayOfInt.clone();
	}

}
