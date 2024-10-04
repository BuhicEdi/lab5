package lab5;

import java.util.Arrays;
/**
 * Detta program testar klassen PrintArray
 * 
 * @author Edi Buhic
 * @version 2024-10-03
 */

public class P5_1 {

	public static void main(String[] args) {
		PrintArray pa = new PrintArray();

		pa.printEvenIndex();
		pa.printEvenElement();
		pa.printReverse();
		pa.printFirstAndLast();
		System.out.println(Arrays.toString(pa.getArray()));
	}
}