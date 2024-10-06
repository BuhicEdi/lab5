package lab5;

public class P5_7 {

	public static void main(String[] args) {
		Student2 newStud = new Student2(args[0]);

		for (int i = 1; i < args.length; i++) {
			newStud.addQuizScore(Double.valueOf(args[i]));
		}

		System.out.println(newStud.getName());
		System.out.println(newStud.getNbrOfQuiz());
		System.out.println(newStud.getTotalScore());
		System.out.println(newStud.getTotalScore());
	}
}
