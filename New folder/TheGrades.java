import java.util.*;
public class TheGrades {
	public static void main(String []args) {

	Scanner input = new Scanner(System.in);
	
	int total = 0;
	int gradeCounter = 1;

	while (gradeCounter <= 10) {
	System.out.print("Enter next grade ");
	int grade = input.nextInt();

	total = total + grade;
	gradeCounter = gradeCounter + 1;
	}

	int average = total / 10;
	
	System.out.printf("%nThe total grade is %d%n", total);
	System.out.printf("The average for the grade is %d%n", average);
	

   }
}