import java.util.Scanner;
	public class FactorOfNumber {
	public static void main(String... args) {

		Scanner input = new Scanner(System.in);
		int count = 0;

		System.out.print(" Enter a random number :");
		int number = input.nextInt();

	for (int factor = 2; factor < number / 2; factor++) {

	if (number % factor == 0) { 
	count++;
		
}
}
	
	System.out.print(count);	
     
		
    
	
  }
}
