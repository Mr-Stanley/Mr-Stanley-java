import java.util.Scanner;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;



	public class CheckoutApp{
		public static void main(String [] args){
		

		
			ArrayList<String> CashierName = new ArrayList<String>();
			ArrayList<String> NameOfCustomer = new ArrayList<String>();
			ArrayList<String> Products = new ArrayList<String>();
			ArrayList<Integer> Quantity = new ArrayList<Integer>(); 	
			ArrayList<Double> PricePerUnit = new ArrayList<Double>();
			ArrayList<Double> Total = new ArrayList<Double>();
	

			LocalDateTime myTime = LocalDateTime.now();
			DateTimeFormatter myFormatTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			String formatDate = myTime.format(myFormatTime);

			Scanner Scanner = new Scanner(System.in);
			System.out.println("SEMICOLON SUPERMARKET AND STORES");
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
		
			
			System.out.println("How Much Per Unit");
			PricePerUnit.add(Scanner.nextDouble());

			
			System.out.println("Add More Items");
			ContinueOrTerminate = Scanner.next();
				}

		System.out.println("What is the cashier's name?");
			CashierName.add(Scanner.next());
			
		System.out.println("what percentage Discount is the customer getting");
			discount = Scanner.nextDouble();

		
		System.out.println("WELCOME TO SEMICOLON SUPERMARKET AND STORES");
		System.out.println("MAIN BRANCH");
		System.out.println("Location : 312, HERBERT MACAULEY WAY, SABO YABA, LAGOS.");
		System.out.println("TEL : 03293828343 ");
		System.out.println("Date : " + formatDate);
		System.out.println("Cashier :" + CashierName);
		System.out.println("Customer Name :"+ NameOfCustomer);
		System.out.println("==============================================================");
		
		System.out.print("ITEM  ");
		
			for(int count = 1; count <= Products.size(); count++){
				System.out.printf("%3s", "");
				}
		System.out.printf("%10s%10s%5s%15s%n","QTY", "PRICE","", "TOTAL(NGN)");
		System.out.println("--------------------------------------------------------------");
				
			for(int index = 0; index < Products.size(); index++){
				System.out.println(Products.get(index));
				}
				
			for(int index = 0; index < Quantity.size(); index++){
				Total.add(Quantity.get(index) * PricePerUnit.get(index));
					
		System.out.printf("%15s%15s%15s%n", Quantity.get(index), PricePerUnit.get(index),Total.get(index));
				}
		System.out.println("----------------------------------------------------------------");
			for (int index = 0; index < Total.size(); index++){
				SubTotal += Total.get(index);
					}
		System.out.println(""+ "Sub Total: "+ "" + SubTotal);
					

				discount = discount / 100;
				discount = discount * SubTotal;
		System.out.println(""+ "Discount : "+ "" + discount);


				VAT = VAT * SubTotal;
		System.out.println(""+ "VAT :" + "" + VAT);

		System.out.println("=================================================================");
				BillTotal = SubTotal - discount + VAT;
		System.out.println("" + "Bill Total : " + BillTotal);
		System.out.println("=================================================================");
		System.out.println("THIS IS NOT YOUR RECEIPT KINDLY PAY :" + "" + BillTotal);
		System.out.println("=================================================================");



		System.out.println("How Much Did The Customer Give To You");

				int amountPaid = Scanner.nextInt();
	

		System.out.println("WELCOME TO SEMICOLON SUPERMARKET AND STORES");
		System.out.println("MAIN BRANCH");
		System.out.println("Location : 312, HERBERT MACAULEY WAY, SABO YABA, LAGOS.");
		System.out.println("TEL : 03293828343 ");
		System.out.println("Date : " + formatDate);
		System.out.println("Cashier :" + CashierName);
		System.out.println("Customer Name :"+ NameOfCustomer);
		System.out.println("==============================================================");
		
		System.out.print("ITEM  ");
		
			for(int count = 1; count <= Products.size(); count++){
				System.out.printf("%3s", "");

					}
		System.out.printf("%10s%10s%5s%15s%n","QTY", "PRICE","", "TOTAL(NGN)");
		System.out.println("--------------------------------------------------------------");
				
			for(int index = 0; index < Products.size(); index++){
	
				System.out.println(Products.get(index));
					}
				
			
			for(int index = 0; index < Quantity.size(); index++){
					Total.add(Quantity.get(index) * PricePerUnit.get(index));
					
		System.out.printf("%15s%15s%15s%n", Quantity.get(index), PricePerUnit.get(index),Total.get(index));
					}
		System.out.println("----------------------------------------------------------------");
	
					
		System.out.println(""+ "Sub Total: "+ "" + SubTotal);
					

		System.out.println(""+ "Discount : "+ "" + discount);

		System.out.println(""+ "VAT :" + "" + VAT);

		System.out.println("=================================================================");
		System.out.println("" + "Bill Total : " + "" + BillTotal);
		System.out.println("" + "Amount Paid : " + "" + amountPaid);
		Balance = amountPaid - BillTotal;
		System.out.println("Balance : " + "" + Balance);
		System.out.println("=================================================================");
		System.out.println("THANK YOU FOR YOUR PATRONAGE");
		System.out.println("=================================================================");

				

				
			
					}
	}