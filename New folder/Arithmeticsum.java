import java.util.Scanner;

public class Arithmeticsum{

	public static void main(String []args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first integer: ");
	int number1 = input.nextInt();

	System.out.print("Enter second integer: ");
	int number2 = input.nextInt();
	
	int number3 = number1 * number1;
	int number4 = number2 * number2;

	int number7 = number3 + number4;
	int number8 = number3 - number4;

	System.out.println(number7);
	System.out.println(number8);
   }
}