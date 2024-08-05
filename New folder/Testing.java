import java.util.*;
public class Testing {
	public static void main(String []args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter total sum ");
	int totalSum = input.nextInt();
	currentSum = 0;
	while (currentsum <= totalSum) {
	System.out.print("Enter an integer ");
	int userInput = Scanner.nextInt();
	currentSum += userInput;
	}
	System.out.println("The sum of the entered integers is: ", currentSum);

	}
}