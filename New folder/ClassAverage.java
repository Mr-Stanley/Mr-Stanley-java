import java.util.*;
public class ClassAverage {
	public static void main(String []args) {

	Scanner input = new Scanner(System.in);

	int total = 0;
	int gradeCounter = 1;

	while (gradeCounter <= 10) {
	System.out.print("Enter next integer ");
	int grade = input.nextInt();
	
	total = total + grade;
	gradeCounter = gradeCounter + 1;
	}
	
	int Average = total / 10;

	System.out.printf("%nThe total grade is %d%n ", total);
	System.out.printf("The grade average is %d ", Average);
   }
}