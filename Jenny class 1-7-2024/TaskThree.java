import java.util.Scanner;
	public class TaskThree {
		public static void main(String []args) {
			Scanner input = new Scanner(System.in);

			
			int sum = 0;
		
		for (int count = 1; count <= 10; count++) {

			System.out.print(" Enter a new score :");
				int number = input.nextInt();
		sum = sum + number;
		
		
}
		int average = sum / 10;



		System.out.println(average + " Is the average of all the scores ");
		System.out.println(sum + " Is the sum of the scores ");
   }
  }
