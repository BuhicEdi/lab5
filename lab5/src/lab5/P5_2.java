package lab5;

public class P5_2 {

	public static void main(String[] args) {
		CheckNumberArray arr = new CheckNumberArray();
		
		arr.addNbr(2);
		arr.addNbr(2);
		arr.addNbr(2);
		
		
		System.out.println(arr.getNbrOfElements());
		System.out.println(arr.getSum());
		System.out.println(arr.isAllTheSame());
		System.out.println(arr.isAccOrder());
		System.out.println(arr.isDesOrder());
		System.out.println(arr.isOrdered());
	}

}
