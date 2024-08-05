  import java.util.Scanner;
	public class BackToSender {
		public static void main(String []args){
		Scanner input = new Scanner(System.in);

	System.out.print(" Enter the number of successful deliveries to calculate rider's pay for the day : ");
			int SuccessfulDeliveries = input.nextInt();




		int SnackFunction = BackToSenderSnack.SnackFunction(SuccessfulDeliveries);

    }
  }