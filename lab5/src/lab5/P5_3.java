package lab5;

import java.util.Arrays;
/**
 * Detta program testar klassen ManipulateArray
 * 
 * @author Edi Buhic
 * @version 2024-10-03
 */

public class P5_3 {

	public static void main(String[] args) {
		ManipulateArray manArr = new ManipulateArray();

		System.out.println(Arrays.toString(manArr.getArrayCopy()));
		System.out.println(manArr.getArraySize());
		System.out.println(manArr.swapFirstAndLast());
		System.out.println(manArr.rightShiftOneStep());
		System.out.println(Arrays.toString(manArr.replaceWithBiggestNeighbor()));
	}
}
