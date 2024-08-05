import java.util.*;
public class LetterGrades{
	public static void main(String []args){

	Scanner input = new Scanner(System.in);
	System.out.print(" Enter next year ");
	int year = input.nextInt();

	if (year <= 1980) {
	System.out.print(" Gen Alpha");
	}
	else if (year >= 1981 && year <= 1999 ) {
	System.out.print(" Gen millenial");
	}
	else if (year >= 2000) {
	System.out.print(" Gen Z");
	}
  }
}

	