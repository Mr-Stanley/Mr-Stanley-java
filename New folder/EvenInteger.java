import java.util.Scanner;
	public class EvenInteger {
		public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print(" Enter an integer :");
		int number = input.nextInt();

	if (number % 2 == 0) { 
	System.out.println(" True");
}
	else if (number % 2 != 0) {
	System.out.println(" False");
}

     }
  }

	