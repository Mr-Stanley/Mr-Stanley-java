import java.util.Scanner;
	public class TaskEight {
		public static void main(String []args) {
			Scanner input = new Scanner(System.in);

			
			int sum = 0;
		
		for (int count = 1; count <= 10; count++)  {

			System.out.print(" Enter a new score :");
				int number = input.nextInt();
		if ( number > 100) {
	System.out.print(" Enter a score below 100 :");
}
		
		
		sum = sum + number;
		
		
}
			
		
		System.out.println(sum + " Is the sum of the Valid number scores ");

   }
  }
