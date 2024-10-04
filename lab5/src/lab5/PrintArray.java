package lab5;

import java.util.Random;
/**
 * Kass som genererar 10 slumpmässiga heltal och lagrar i en array, som sedan kan mata ut saker som jämna index, jämna element etc.
 * 
 * @author Edi Buhic
 * @version 2024-10-03
 */

public class PrintArray {

	// Klassattribut som lagrar den genererade arrayen 
	private int[] arrayOfInt;

	// Konstruktor som genererar 10 slumpmässiga tal och lagrar
	public PrintArray() {
		arrayOfInt = new int[10];
		Random r = new Random();

		for (int i = 0; i < arrayOfInt.length; i++) {
			this.arrayOfInt[i] = r.nextInt(1, 10);
		}
	}

	// Metod som matar ut alla jämna index i arrayen
	public void printEvenIndex() {
		for (int i = 0; i < arrayOfInt.length; i=i+2) {
			System.out.println(arrayOfInt[i]);
		} 
	}

	// Metod som matar ut alla jämna element i arrayen
	public void printEvenElement() {
		for (int i = 0; i < arrayOfInt.length; i++) {
			int value = arrayOfInt[i];

			while (value > 0) {
				value = value - 2;
			}

			if (value == 0) {
				System.out.println(arrayOfInt[i]);
			}									
		}
	}

	// Metod som matar ut hela arrayen i omvänd ordning
	public void printReverse() {
		for (int i = arrayOfInt.length - 1; i >= 0; i--) {
			System.out.print(arrayOfInt[i] + ", ");
		}
	}

	// Metod som matar ut första samt sista elementet i arrayen
	public void printFirstAndLast() {
		int first = 0;
		int last = arrayOfInt.length - 1;

		System.out.println(arrayOfInt[first] + ", " + arrayOfInt[last]);
	}
	
	// Metod som returnerar en kopia på hela arrayen
	public int[] getArray() {
		return arrayOfInt.clone();
	}
}