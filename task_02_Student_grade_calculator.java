package task_02_std_grd_calculate;

import java.util.Scanner;

public class std_grd_calculator {
	static void CalculateGrade() {
		Scanner sc = new Scanner(System.in);
		float totalMarks = 0;
		float averagePercentage;
		System.out.println("         *** Welcome to the Student Grade Calculator ***\n\n");
		System.out.print("Enter the number of subjects: ");
		int subjects = sc.nextInt();
		System.out.println();
		for (int i = 1; i <= subjects; i++) {
			System.out.print("Enter marks obtained in subject " + i + ": ");
			float marks = sc.nextFloat();
			totalMarks += marks;
		}
		averagePercentage = totalMarks / (float) subjects;
		String grade;
		if (averagePercentage >= 90) {
			grade = "A";
		} else if (averagePercentage >= 80) {
			grade = "B";
		} else if (averagePercentage >= 60) {
			grade = "C";
		} else if (averagePercentage >= 40) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println("\nTotal Marks: " + totalMarks);
		System.out.println("Average Percentage: " + averagePercentage + "%");
		System.out.println("Student Grade: " + grade);
	}

	public static void main(String[] args) {
		CalculateGrade();
	}
}
