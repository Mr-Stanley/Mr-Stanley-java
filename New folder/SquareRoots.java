import java.util.Scanner;

	public class SquareRoots {
	public static void main(String []args) {

	Scanner input = new Scanner(System.in);

	System.out.print(" Enter a number to check :");
	int number = input.nextInt();

	for(int count = 1; count < number;count++){

	if(number / count == count) return true; 

	return false;	     	
	}
   }
}

	
