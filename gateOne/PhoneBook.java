import java.util.Scanner;
import java.util.ArrayList;
public class PhoneBook{
	public static void main(){

		Scanner Scanner = new Scanner(System.in);
		

		String number = "";
		int deleted = 0;
		ArrayList<String> firstName = new ArrayList<String>();
		ArrayList<String> lastName = new ArrayList<String>();
		ArrayList<String> phoneNumber = new ArrayList<String>();

		System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n","1.Add Contacts.", "2.Remove Contacts.", "3.Find  Contacts.", "4.Find Contact by first name.", "5.Find contacts by last name.", "6.Edit Contacts.");
		
		System.out.println("Select a number to continue : ");
		number = Scanner.next();

		int numbers = Integer.parseInt(String.valueOf(number));
		if (numbers == 1){
	
			System.out.println("Enter FirstName : ");
				firstName.add(Scanner.next());
			
			System.out.println("Enter LastName : ");
				firstName.add(Scanner.next());

			System.out.println(" Enter Phone Number : ");
				firstName.add(Scanner.next());
 	
		}
		
	
			System.out.println(firstName);

		main();

		if (numbers == 2){
			
			for(int index = 0; index < firstName.size(); index++){

			firstName = null;
				
			System.out.println(firstName);
			}
			}
			main();
		if (numbers == 3){
			System.out.println("Enter a contact name or number to search");
				int nameOfContact = Scanner.nextInt();
			    if (firstName.contains(nameOfContact)) {
				    System.out.println("Contact Exists in our DataBase");
				    } else {
					    System.out.println("Contacts does not exist");
}
}
				


		
			}

		public static void main(String [] args){
		main();
		}


			


		





}