package lab5;

public class P5_1 {

	public static void main(String[] args) {
		PrintArray pr = new PrintArray();
		int[] array = pr.getArray();


		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		pr.printReverse();
		pr.printFirstAndLast();
		



	}

}
