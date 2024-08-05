import java.util.*;
public class LetterGrade {
	public static void main(String []args) {
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter next grade ");
	int grade = input.nextInt();

	if (grade >= 80) {
	System.out.print(" Your grade is A ");
	}
	
	 else if (grade >= 70 && grade <= 79) {
	System.out.print(" Your grade is B ");
	}
	
	else if (grade >= 50 && grade <= 69) {
	System.out.print(" Your grade is C ");
	}

	else if (grade <= 49) {
	System.out.print( " Your grade is D ");
	}
	
	
	
	

   }
 }

	

