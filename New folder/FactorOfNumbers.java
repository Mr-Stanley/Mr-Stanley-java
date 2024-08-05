import java.util.Scanner;
	public class FactorOfNumbers {
	public static void main(String []args) {

		Scanner input = new Scanner(System.in);

		System.out.print(" Enter a random number :");
		int number = input.nextInt();


		int factor = 0;

	for (factor = 1; factor <= number; factor++) {

	if (number % factor == 0) { 
		factor++;
}
}
	
	System.out.print(factor);	
     
		
    
	
  }
}
