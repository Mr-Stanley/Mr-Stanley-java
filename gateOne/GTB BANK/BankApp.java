import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;	
	public class BankApp{
		public static void main(String [] args){
		Scanner Scanner = new Scanner(System.in);
		        Random random=new Random();
		int selectNumber = 0;
		int accountNumb = 0;
		String pin = "";
		String comfirmPin = "";
		ArrayList<String> firstName = new ArrayList<String>();
		ArrayList<String> lastName = new ArrayList<String>();
		ArrayList<String> phoneNumber = new ArrayList<String>();
		ArrayList<Integer> accountNumber = new ArrayList<Integer>();
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
			pin = Scanner.next();
		System.out.println("Please re-enter the four digit pin for comfirmation");
			comfirmPin = Scanner.next();
		if (comfirmPin == pin) System.out.println(" Pin created successfully");
			System.out.println("Pin Created succesfully");
		accountNumber.add(random.nextInt(1000));
		for(int index = 0; index < accountNumber.size(); index++){
		System.out.println("Your Account Number is : " + accountNumber.get(index));
			
			}
			}
			}
		int accountDeletion = 0;
		String comfirmationToCloseAccount = "yes";
		while(closeAccount.equalsIgnoreCase("yes"))
		System.out.println("Do you want to close your account");
			comfirmationToCloseAccount = Scanner.next();

		System.out.println("Enter the Account Number of the account you want to delete");
			accountDeletion = Scanner.nextInt();
		if(accountDeletion == accountNumber.get(index)){
				
        		accountNumber.remove(index);
		System.out.println(accountNumber(index));
			}
}



	}

