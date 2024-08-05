import java.util.Scanner;
public class Acceleration{
	public static void main(String []args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first double");
	double number = input.nextDouble();

	System.out.print("Enter second double");
	double number1 = input.nextDouble();

	System.out.print("Enter third double");
	double number2 = input.nextDouble();

	double sum = number - number1;
	double average = sum / number2;

	System.out.printf("The average acceleration is %s", average);

	


    }
}	