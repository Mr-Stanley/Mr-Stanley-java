import java.util.Scanner;

public class CreditCardCollector{
	public static void main(String [] args){
	
		Scanner Scanner = new Scanner(System.in);

		System.out.println("Hello, Kindly Enter Card Details to Verify");
		String CardNumber = Scanner.next();

		if(validOrInvalid(CardNumber))System.out.println("Invalid entry, check card number and retry");
		else {
			double totals  = AddTotalOfOddPlacesAndSecondDigitFromRightToLeft(CardNumber);
			String validity = ValidityStatusChecker(CardNumber);
			String type = getCategories(CardNumber);
			System.out.println("\n******************************");
			System.out.printf("**Credit Card Type: %s", type);
			System.out.printf("%n**Credit Card Number: %s", CardNumber);
			System.out.printf("%n**Credit Card Digit length: %s", CardNumber.length());
			System.out.printf("%n**Credit card Validity Status: %s",validity);
			System.out.println("\n******************************");
		}

	}
	
	public static boolean validOrInvalid(String CardNumber){
		return CardNumber.length() < 13 || CardNumber.length() > 16;
	}

	public static String getCategories(String CardNumber){
 		String category = "";
		if(CardNumber.charAt(0) == 4)category = "Visa Card";
		else if(CardNumber.charAt(0) == '5') category =  "Master Card";
		else if (CardNumber.charAt(0) == '6') category = "Discover Card";
		else if (CardNumber.charAt(0) == '3' && CardNumber.charAt(1) == '7') category = "American Express Card";
		else category = "Invalid";
		return category;
	}
	
	public static double getSecondDigitFromRightToLeft(String CardNumber){
		double total = 0;
		for (int index = CardNumber.length()-2; index >= 0; index-=2){
			int numbers = Integer.parseInt(String.valueOf(CardNumber.charAt(index)));
			numbers = numbers *2;
			if(numbers  > 9) numbers = numbers / 10 + numbers % 10;
				total = total + numbers;
				numbers = 0;
			}
		return total;
	}
	
	public static double getAllDigitsAtOddPlaces(String CardNumber){
		double totalOfOddPlaces = 0;

		for(int index = CardNumber.length()-1; index >= 0; index-=2){
			int numbers = Integer.parseInt(String.valueOf(CardNumber.charAt(index)));
			totalOfOddPlaces+= numbers;
			numbers	= 0;
		}
		return totalOfOddPlaces;
	}

	public static double AddTotalOfOddPlacesAndSecondDigitFromRightToLeft(String CardNumber){
		double sum = getAllDigitsAtOddPlaces(CardNumber) + getSecondDigitFromRightToLeft(CardNumber);
		return sum;
	}

	public static String ValidityStatusChecker(String CardNumber){
		String checker = "";
		if(AddTotalOfOddPlacesAndSecondDigitFromRightToLeft(CardNumber) % 10 == 0) checker = "Valid Card Number";
		else checker = "Invalid CardNumber";
		return checker;

	}




}	