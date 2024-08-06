import java.util.Scanner;
import java.util.ArrayList;

	public class CheckoutApplication{
		public static void main(String [] args){
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Welcome To ObodUkwu Supermarket And Stores");
		

		ArrayList<String> NameOfCustomer = new ArrayList();
		ArrayList<String> Products = new ArrayList();
		ArrayList<Integer> Quantity = new ArrayList(); 	
		ArrayList<Integer> PricePerUnit = new ArrayList();
		ArrayList<Boolean> AddMoreItem = new ArrayList();	
		
		
		System.out.print(Arrays.deepToString(Products));



		}

	public static String getNameOfCustomer(String name){
		
		System.out.println("What is the name of the Customer :");
			NameOfCustomer.add(Scanner.next());
		}
	public static String getProducts(String Products){
		System.out.println("What did the User Buy");
			Products.add(Scanner.next());


		}
	public static Int getQuantity (int Quantity){
		System.out.println("How Many Pieces");
			Quantity.add(Scanner.next());


		}

	public static int getPricePerUnit(int PricePerUnit){
		System.out.println("How Much Per Unit");
			PricePerUnit.add(Scanner.next());

		}

	/*public static boolean AddMoreItems(String ContinueOrTerminate){
		String pass = "";
		System.out.println("Add More Items");
		pass = Scanner.next();

		return pass;
		


		}*/
		

}