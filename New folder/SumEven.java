	
import java.util.Scanner;
	public class SumEven {
		public static void main(String []args) {
			Scanner input = new Scanner(System.in);

		int sum = 0;	
		
		
		for (int indices = 1; indices <= 10; indices++) {

		System.out.print(" Enter a number :");
			int number = input.nextInt();
	
		if (indices % 2 == 0) {
		continue;
}
		sum = sum + number;
}

		System.out.print(sum);

   }
}
		
		