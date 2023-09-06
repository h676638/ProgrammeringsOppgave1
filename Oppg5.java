import java.util.Scanner;
import java.util.Arrays;

public class Oppg5 {
	public static void main(String[] args) {
		String[] allGrades = new String[10];
		for(int i = 0;i<10;i++) {
			System.out.println("Enter your points: ");
			Scanner myObj = new Scanner(System.in);
			int points = myObj.nextInt();
			String character = convertToGrade(points);
			if (character == "1") {
				System.out.println("Invalid input, must be a number between 0-100");
				i--;
				continue;
			}
			allGrades[i] = character;
		}
		System.out.println(Arrays.toString(allGrades));
	}
	public static String convertToGrade(int points) {
		String grade = "grade";
		if(points < 0 || points > 100) {
			return "1";
		}
		if (points<40) {
			grade = "F";
		}
		else if (points<50) {
			grade = "E";
		}
		else if (points<60) {
			grade = "D";
		}
		else if (points<80) {
			grade = "C";
		}
		else if (points<90) {
			grade = "B";
		}
		else {
			grade = "A";
		}
		return grade;
	}
}
