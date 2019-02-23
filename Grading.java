//Your class should have a reasonable set of accessor and mutator methods, an equals method, and a toString method, whether or not your program uses them. You may add other methods if you wish.

//he program should read in the student’s scores and output the student’s record, which consists of three quiz scores and two exam scores, as well as the student’s overall numeric score for the entire course and final letter grade.
import java.util.Scanner;

public class Grading {
	private double quiz1, quiz2, quiz3;
	private double midterm;
	private double final_exam;
	private double numeric_score; //Number from 0 to 100: weighted average of the student’s work.
	private String grade;

	public void setTests() {
		quiz1 = 0;
		quiz2 = 0;
		quiz3 = 0;
		midterm = 0;
		final_exam = 0;
	}

	public double getTestScores() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter quiz 1 score: ");
		quiz1 = input.nextDouble();
		System.out.println("Enter quiz 2 score: ");
		quiz2 = input.nextDouble();
		System.out.println("Enter quiz 3 score: ");
		quiz3 = input.nextDouble();

		System.out.println("Enter midterm score: ");
		midterm = input.nextDouble();

		System.out.println("Enter final test score: ");
		final_exam = input.nextDouble();

		double quizScore = ((quiz1 + quiz2 + quiz3)/3*.1*100)*.25;
		double midtermTotal = midterm * 0.35;
		double examTotal = final_exam * 0.4;

		numeric_score = quizScore + midtermTotal + examTotal;

		return numeric_score;
	}

	public String getLetterGrade() {
		if(numeric_score >= 90)
			grade = "A";
		else if(numeric_score >= 80)
			grade = "B";
		else if(numeric_score >= 70) 
			grade = "C";
		else if(numeric_score >= 60)
			grade = "D";
		else
			grade = "F";

		return grade;
	}

	public String toString() {
		return("Quiz 1: "+ quiz1 + " Quiz 2: " + quiz2 + " Quiz 3: " + quiz3 + " Midterm: " + midterm + " Final: " + final_exam + " Numeric Grade: " + numeric_score + " Letter grade: "+ grade);
	}
}