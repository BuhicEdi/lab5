package lab5;

import java.util.Arrays;

public class Student2 {

	private String name;
	private double[] quizzes = new double[MAX_QUIZZES];
	private int nbrOfQuiz = 0;

	private static final int MAX_QUIZZES = 10;

	public Student2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addQuizScore(double score) {
		if (nbrOfQuiz < MAX_QUIZZES) {
			quizzes[nbrOfQuiz] = score;
			nbrOfQuiz++;
		}
	}

	public double getTotalScore() {

		double totalSum = 0;

		for (int i = 0; i < nbrOfQuiz; i++) {
			totalSum += quizzes[i];
		}

		return totalSum;
	}

	public double getAverageScore() {
		if (nbrOfQuiz > 0) {
			return getTotalScore() / nbrOfQuiz;
		} else {
			return 0;
		}
		
	}

	public int getNbrOfQuiz() {
		return nbrOfQuiz;
	}

	public double getQuizScore(int index) {
		return quizzes[index];
	}

	public double[] getQuizzesCopy() {
		return quizzes.clone();
	}

	public String toString() {
		return Arrays.toString(quizzes);
	}


}