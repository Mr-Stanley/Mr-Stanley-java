import java.util.Scanner;
public class Runwaylength{
	public static void main(String []args){

	Scanner Scanner = new Scanner(System.in);
	System.out.println("Enter first integer");
	int number1 = Scanner.nextInt();

	System.out.println("Enter second integer");
	int number2 = Scanner.nextInt();

	int mult = number1 * 2;
	int multy = 2 * number2;
	int area = number1 / number2;

	System.out.printf("Length of runway is %d%n", area);
	
	

     }
  }