package lab5;

import java.util.Arrays;
/**
 * Klass som skapar en ny student och lagrar antal skrivna tentamen samt resultat för att sedan kunna mata ut saker som totalpoäng, medelvärde, full kopia etc. 
 * 
 * @author Edi Buhic
 * @version 2024-10-03
 */

public class Student2 {

	// Klassattribut som lagrar namn, antal tentamen samt poäng
	private String name;
	private double[] quizzes = new double[MAX_QUIZZES];
	private int nbrOfQuiz = 0;

	// Maxspärr på antalet lagrade tentamen
	private static final int MAX_QUIZZES = 10;

	// Konstruktor som skapar en ny student och tar emot personens namn
	public Student2(String name) {
		this.name = name;
	}

	// Metod som returnerar studenens fulla namn
	public String getName() {
		return name;
	}

	// Metod som adderar ny tentamensresultat
	public void addQuizScore(double score) {
		if (nbrOfQuiz < MAX_QUIZZES) {
			quizzes[nbrOfQuiz] = score;
			nbrOfQuiz++;
		}
	}

	// Metod som returnerar totalpoängen
	public double getTotalScore() {
		double totalSum = 0;

		for (int i = 0; i < nbrOfQuiz; i++) {
			totalSum += quizzes[i];
		}
		return totalSum;
	}

	// Metod som tar fram studentens medelvärde
	public double getAverageScore() {
		if (nbrOfQuiz > 0) {
			return getTotalScore() / nbrOfQuiz;
		} else {
			return 0;
		}
	}

	// Metod som returnerar antalet skrivna/lagrade tentor
	public int getNbrOfQuiz() {
		return nbrOfQuiz;
	}

	// Metod som returnerar ett visst tentamensresultat baserat på vilket index som matas in
	public double getQuizScore(int index) {
		return quizzes[index];
	}

	// Metod som returnerar en kopia av alla lagrade tentamen i arrayformat
	public double[] getQuizzesCopy() {
		return quizzes.clone();
	}

	// Metod som returnerar en kopia av alla lagrade tentamensresultat i strängformat
	public String toString() {
		return Arrays.toString(quizzes);
	}
}