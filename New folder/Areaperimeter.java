import java.util.Scanner;
public class Areaperimeter{
	public static void main(String []args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int number1 = input.nextInt();

	System.out.print("Enter second integer: ");
	int number2 = input.nextInt();
	
	int mult = number1 * number2;
	int sum = 2 * number1 + number2;

	System.out.printf("Area is %d%n", mult);
	
	System.out.printf("Perimeter is %d%n", sum);
	



   }
}
