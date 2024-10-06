package lab5;
/**
 * Detta program testar klassen CheckNumberArray
 * 
 * @author Edi Buhic
 * @version 2024-10-03
 */

public class P5_2 {

	public static void main(String[] args) {
		CheckNumberArray chkNum = new CheckNumberArray();

		// Matar in exempeltal
		chkNum.addNbr(8);
		chkNum.addNbr(6);
		chkNum.addNbr(4);
		chkNum.addNbr(3);
		chkNum.addNbr(-1);

		System.out.println(chkNum.getNbrOfElements());
		System.out.println(chkNum.getSum());
		System.out.println(chkNum.getAverage());
		System.out.println(chkNum.isAllTheSame());
		System.out.println(chkNum.isAccOrder());
		System.out.println(chkNum.isDesOrder());
		System.out.println(chkNum.isOrdered());
	}
}
