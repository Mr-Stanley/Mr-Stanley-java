import java.util.*;
	public class CollectScore {
	public static void main(String []args) {

	Scanner input = new Scanner(System.in);
 
	System.out.print("Enter first Score ");
	int Score1 = input.nextInt();

	System.out.print("Enter second Score ");
	int Score2 = input.nextInt();

	System.out.print("Enter third Score ");
	int Score3 = input.nextInt();

	System.out.print("Enter fourth Score ");
	int Score4 = input.nextInt();

	System.out.print("Enter fifth Score ");
	int Score5 = input.nextInt();

	System.out.print("Enter sixth Score ");
	int Score6 = input.nextInt();

	System.out.print("Enter seventh Score ");
	int Score7 = input.nextInt();

	System.out.print("Enter eight Score ");
	int Score8 = input.nextInt();

	System.out.print("Enter ninth Score ");
	int Score9 = input.nextInt();

	System.out.print("Enter tenth Score ");
	int Score10 = input.nextInt();

	int sum = Score1 + Score2 + Score3 + Score4 + Score5 + Score6 + Score7 + Score8 + Score9 +Score10;

	int average = sum / 10;

	System.out.printf(" sum of the Scores is %d%n ", sum);
	System.out.printf(" The average of the Scores is %d%n ", average);

     }
   }