import java.util.*;
public class ReadIntegers {
	public static void main(String []args) {
	Scanner input = new Scanner(System.in);
	
	
	System.out.print("Enter first integer ");
	int number1 = input.nextInt();
	int sum = 0;

	int totalCounter = 0;


	while (number1 >=  sum) {
	
	


	System.out.print("Enter next integer ");
	int nextNumber = input.nextInt();
	
	sum = sum + nextNumber;

	totalCounter = totalCounter + 1;
	
	}
       
   }
 }