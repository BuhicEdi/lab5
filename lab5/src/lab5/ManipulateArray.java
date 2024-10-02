package lab5;

import java.util.Arrays;
import java.util.Random;

public class ManipulateArray {

	private int[] arrayOfInt;
	
	
	public ManipulateArray() {
		
		Random r = new Random();
		this.arrayOfInt = new int[10];
		
		for (int i = 0; i < 10; i++) {
			this.arrayOfInt[i] = r.nextInt(1, 10);
		}
	}
	
	public ManipulateArray(int[] arr) {
		this.arrayOfInt = arr;
	}
	
	public int[] getArrayCopy() {
		return arrayOfInt.clone();
	}
	
	public int getArraySize() {
		return arrayOfInt.length;
	}
	
	public String swapFirstAndLast() {
		int[] arrSwap = arrayOfInt.clone();
		int last = arrayOfInt.length - 1;
		
		arrSwap[0] = arrayOfInt[last];
		arrSwap[last] = arrayOfInt[0];
		
		return Arrays.toString(arrSwap);
	}
	
	public String rightShiftOneStep() {
		int[] arrSwap = arrayOfInt.clone();
		
		int last = arrayOfInt[(arrayOfInt.length-1)];
		
		for (int i = arrayOfInt.length - 1; i > 0; i--) {
			arrSwap[i] = arrSwap[i - 1];
		}
		
		arrSwap[0] = last;
		
		return Arrays.toString(arrSwap);
	}
	
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