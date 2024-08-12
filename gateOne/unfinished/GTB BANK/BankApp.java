import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;	
	public class BankApp{
		public static void main(String [] args){
		Scanner Scanner = new Scanner(System.in);
		        Random random=new Random();
		int selectNumber = 0;
		int accountDeletion = 0;
		
		ArrayList<String> firstName = new ArrayList<String>();
		ArrayList<String> lastName = new ArrayList<String>();
		ArrayList<String> phoneNumber = new ArrayList<String>();
		ArrayList<Integer> accountNumber = new ArrayList<Integer>();
		ArrayList<String> pin = new ArrayList<String>();
	while (selectNumber != 9){	
	System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "1. Create Account.", "2. Close Account.", "3. Deposit Money.", "4. Withdraw Money.", "5. Check Account Balance.", "6. Inter Account Transfer.", "7. Change Pin.", "9. Terminate.");

	
	System.out.println("Select a Number to Continue");
		selectNumber = Scanner.nextInt();

	if(selectNumber == 1){
		System.out.println("Create Account");
		System.out.println("Enter Your First Name");
			firstName.add(Scanner.next());
		
		System.out.println("Enter Your Last Name");
			lastName.add(Scanner.next());
		
		System.out.println("Enter Your Phone Number");
			phoneNumber.add(Scanner.next());

		  
		System.out.println(" Account Created Successfully!!!");
		System.out.println("Please enter a four digit pin");
			pin.add(Scanner.next());
		System.out.println(" Pin created successfully");
		accountNumber.add(random.nextInt(1000));
		for(int index = 0; index < accountNumber.size(); index++){
		
		System.out.println("Here are your account details : " + "NAME : " + firstName.get(index) + " " + lastName.get(index) + " " + "PHONENUMBER : " + phoneNumber.get(index) + " " + "PIN :" + pin.get(index) + " " + "ACCOUNT NUMBER :" + accountNumber.get(index));	
			
			
			}
			}
			}
		

		if(selectNumber == 2){ 
		
		System.out.print("Enter your account Number");
		accountDeletion = Scanner.nextInt();
		if (accountDeletion == accountNumber.get(index)){
		System.out.println("Enter your pin to comfirm");
		String comfirmPin = Scanner.next();

		if (comfirmPin == pin.get(index)){
		
		firstName.remove(index);
		lastName.remove(index);
		phoneNumber.remove(index);
		pin.remove(index);
		
			}
		else
		System.out.println("Invalid Pin");
			}
			
		
			
			
			}
}



	}

