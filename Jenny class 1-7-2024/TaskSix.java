import java.util.Scanner;
	public class TaskSix {
		public static void main(String []args) {
			Scanner input = new Scanner(System.in);

			int counter=0;
			int sum = 0;
		
		for (int count = 1; count <= 10; count++) {

			System.out.print(" Enter a new score :");
				int number = input.nextInt();

		if (count % 2 == 0)
		counter++;
		sum = sum + number;

		int average = sum/counter;
		
		
}	
		System.out.println(average + " Is the average of the even scores ");
   }
  }
