public class GradingDemo {
	public static void main(String[] args) {
		Grading student1 = new Grading();

		student1.getTestScores();
		student1.getLetterGrade();

		System.out.println(student1.toString());
	}
}