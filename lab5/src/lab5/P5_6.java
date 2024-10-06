package lab5;

import java.util.Arrays;
/**
 * Detta program testar klassen Student2
 * 
 * @author Edi Buhic
 * @version 2024-10-03
 */

public class P5_6 {

	public static void main(String[] args) {
		Student2 pucksac = new Student2("puck sac");

		System.out.println(pucksac.getName());
		pucksac.addQuizScore(3.14);
		pucksac.addQuizScore(5);
		System.out.println(pucksac.getTotalScore());
		System.out.println(pucksac.getAverageScore());
		System.out.println(pucksac.getNbrOfQuiz());
		System.out.println(pucksac.getQuizScore(0));
		System.out.println(Arrays.toString(pucksac.getQuizzesCopy()));
		System.out.println(pucksac.toString());
	}
}
