import java.util.Scanner;
import java.util.ArrayList;

	public class CheckoutApp{
		public static void main(String [] args){
		
		Scanner Scanner = new Scanner(System.in);

		System.out.println("/nWelcome To ObodUkwu Supermarket And Stores");

		ArrayList<String> NameOfCustomer = new ArrayList<String>();
		ArrayList<String> Products = new ArrayList<String>();
		ArrayList<Integer> Quantity = new ArrayList<Integer>(); 	
		ArrayList<Double> PricePerUnit = new ArrayList<Double>();

		
		
		System.out.println("/nMain Office");
		System.out.println("\nLocation");
		System.out.println("tel");

		String ContinueOrTerminate = "yes";

		System.out.println("What is the name of the Customer :");
		NameOfCustomer.add(Scanner.next());
		
		double SubTotal = 0;
		double discount = 0;
		double VAT = 7.5 / 100;
		double BillTotal = 0;
		double AmountPaid = 0;
		double Balance = 0;
		while(ContinueOrTerminate.equalsIgnoreCase("yes")){

			System.out.println("What did the User Buy");
			Products.add(Scanner.next());

			System.out.println("How Many Pieces");
			Quantity.add(Scanner.nextInt());
			/**if(Quantity <= 0){
				 System.out.println("Invalid Selection");
				 
			}**/
		
			
			System.out.println("How Much Per Unit");
			PricePerUnit.add(Scanner.nextDouble());

			
			System.out.println("Add More Items");
			ContinueOrTerminate = Scanner.next();
			

			}
		System.out.println(Products);
		System.out.println(Quantity);	
		System.out.println(PricePerUnit);
		}
	}