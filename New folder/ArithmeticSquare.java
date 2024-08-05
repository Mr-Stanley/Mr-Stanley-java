import java.util.*;
public class  {

	public static void main(String []args){


	Scanner input = new Scanner(System.in);
	System.out.print("Enter first integer: ");
	int number1 = input.nextInt();


	System.out.print("Enter second integer: ");
	int number2 = input.nextInt();

	
	int square1 = number1 * number1;
	int square2 = number2 * number2;

	System.out.printf("The square of first integer is %d%n ", square1);
	System.out.printf("The Square of second integer is %d%n ", square2);

	int sum = square1 + square2;

	System.out.printf("The sum of the two squares is %d%n ", sum);

	int diff = square1 - square2;

	System.out.printf("The difference between the two integers is %d%n ", diff);

	


     }
}
	
