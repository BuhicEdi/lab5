package lab5;

import java.util.Arrays;
import java.util.Random;
/**
 * Denna klass lagrar en array (antingen slumpmässigt genererad eller en förkonsturerad) och har sedan metoder som kan manipulera den.
 * 
 * @author Edi Buhic
 * @version 2024-10-03
 */

public class ManipulateArray {

	// Klassattribut som lagrar arrayen
	private int[] arrayOfInt;

	// Ena konstruktorn som genererar en helt ny array med 10 slumpmässiga heltal
	public ManipulateArray() {
		Random r = new Random();
		this.arrayOfInt = new int[10];

		for (int i = 0; i < 10; i++) {
			this.arrayOfInt[i] = r.nextInt(1, 10);
		}
	}

	// Andra konstruktorn som istället tar emot en förkonstruerad array
	public ManipulateArray(int[] arr) {
		this.arrayOfInt = arr;
	}

	// Metod som returnerar en kopia av den manipulerade arrayen
	public int[] getArrayCopy() {
		return arrayOfInt.clone();
	}

	// Metod som returnerar arrayens storlek
	public int getArraySize() {
		return arrayOfInt.length;
	}

	// Metod som byter ut första och sista elementet med varandra
	public String swapFirstAndLast() {
		int[] arrSwap = arrayOfInt.clone();
		int last = arrayOfInt.length - 1;

		arrSwap[0] = arrayOfInt[last];
		arrSwap[last] = arrayOfInt[0];

		return Arrays.toString(arrSwap);
	}

	// Metod som flyttar varje element ett steg åt höger
	public String rightShiftOneStep() {
		int[] arrSwap = arrayOfInt.clone();

		int last = arrayOfInt[(arrayOfInt.length-1)];

		for (int i = arrayOfInt.length - 1; i > 0; i--) {
			arrSwap[i] = arrSwap[i - 1];
		}

		arrSwap[0] = last;

		return Arrays.toString(arrSwap);
	}

	// Metod som byter ut elementet mot största grannen
	public int[] replaceWithBiggestNeighbor() {
		int[] arrCpy = arrayOfInt.clone();

		for (int i = 1; i < (arrayOfInt.length - 1); i++) {
			if (arrayOfInt[i-1] > arrayOfInt[i+1]) {
				arrCpy[i] = arrayOfInt[i-1];
			} else {
				arrCpy[i] = arrayOfInt[i+1];
			}
		}
		return arrCpy.clone();
	}
}