import java.util.*;
public class Switch {
	public static void main(String []args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter a score ");
	int score = input.nextInt();

	
	switch (score) {
		case 80: System.out.print("A");
		break;
		case 70: System.out.print("B");
		break;
		case 60: System.out.print("C");
		break;
		case 50: System.out.print("D");
		break;
		case 40: System.out.print("E");
		break;
		default:
                System.out.print("Invalid");
		
	}
	
	
    }
}