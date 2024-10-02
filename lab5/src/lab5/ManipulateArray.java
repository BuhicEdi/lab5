package lab5;

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
		
		return arrSwap.toString();
	}
	
	public void rightShiftOneStep() {
		
	}
	
	public void replaceWithBiggestNeighbor() {}
	
	
}