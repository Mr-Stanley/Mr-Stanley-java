import java.util.Scanner;
	public class KataFile {
	public static void main(String []args){ 
	Scanner input = new Scanner(System.in);

	System.out.println(" Welcome to Umunna Maths school.");
	System.out.println(" Press Select a number to continue :");
	System.out.printf("%n 1. Even Number.%n 2. Prime Number.%n 3. Subtraction.%n 4. Division.%n 5. Factors.%n 6. Square.%n 7. Palindrome.%n 8. Factorial. : "); 
	int number0 = input.nextInt();

	switch (number0) {

	case 1: System.out.print(" Enter a number to calculate Even :");
		int number = input.nextInt();

	if (number % 2 == 0) {
	System.out.print(" True");
}
	else
	System.out.print(" False");
		break;



	case 2: System.out.print(" Enter a number to check for prime number :");
		int number1 = input.nextInt();

	if (number1 % 2 != 0 && number1 % 3 != 0) {
	System.out.println(" True");
}
	else
	System.out.println(" False");
		break;
	

	case 3: System.out.print(" Enter a number :");
		int number3 = input.nextInt();
		
		System.out.print(" Enter second number :");
		int number4 = input.nextInt();

	int difference = number3 - number4;
	
	System.out.print(difference);
		break;

	case 4: System.out.print(" Enter a number to continue :");
		float number5 = input.nextFloat();
	
		System.out.print(" Enter a number to continue :");
		float number6 = input.nextFloat();
		
	float quotient = number5 / number6;

		System.out.print(quotient);
		break;

	case 5: System.out.print(" Enter a number to check it's factor :");
		int number7 = input.nextInt();

		int numberOfFactors = 1;
		
		for (int factor = 1; factor < number7 / 2; factor++) {

		if (number7 % factor == 0) { 
	numberOfFactors++;
}

}
	System.out.print(" The number of factors of " + number7 + " is" numberOfFactors++);
		break;
		

	case 6: System.out.print(" Enter a number :");
		int number8 = input.nextInt();

		for(int count = 1; count < number8;count++) {

	if(number8 / count == count) 
	
	System.out.print(number8 / count == count ? "true" : "false");
		
}
		break;


	case 7: System.out.print(" Enter number to check if its palindrome :");
		int number9 = input.nextInt();


	int firstNumber = number9 % 10;
	int secondNumber = number9 / 10 % 10;
	int thirdNumber = number9 / 100 % 10;
	int fourthNumber = number9 / 1000 % 10;
	int fifthNumber = number9 / 10000 % 10;

	if ( firstNumber == fifthNumber && secondNumber == fourthNumber) 
		System.out.print(" It's a palindrome");
	else System.out.print(" It's not a palindrome");
		break;


	case 8: System.out.println(" Enter a number to calculate it's factorial :");
		int number10 = input.nextInt();

	int factorial = 1;
	int count = 1;
	
	for (count =1; count <= number10; count++){
	
	factorial = factorial * count;

}

	System.out.print(" The Factorial of " + number10 + " is " + factorial);
     }
   }
}
	

