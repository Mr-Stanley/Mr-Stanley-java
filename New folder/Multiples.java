import java.util.*;
public class Multiples {
	public static void main(String []args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter new integer ");
	int number1 = input.nextInt();

	System.out.print("Enter new integer ");
	int number2 = input.nextInt();

	
	boolean multiple = (number1 * 3) % (number2 * 2) == 0;

	System.out.print(multiple);

   }
} 
	