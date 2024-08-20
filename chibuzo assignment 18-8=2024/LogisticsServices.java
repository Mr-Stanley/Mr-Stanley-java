import java.util.Scanner;
	public class LogisticsServices {
		public static void main(String [] args){
		Scanner Scanner = new Scanner(System.in);

		
		System.out.println("How Many Packages Was Delivered");
		int numberOfDeliveries = Scanner.nextInt();

	
		if(validOrInvalid(numberOfDeliveries))System.out.println("Invalid entry, check number of deliveries and retry");
		else {
		int howMuchPerParcel = amountPerParcel(numberOfDeliveries);
		//int parcelDelivered =  validOrInvalid(numberOfDeliveries);
		int salary = checkDailyWage(numberOfDeliveries);
		//System.out.print(parcelDelivered);
		System.out.printf("%s%s%n", " Your wage for today is:" , salary);

	}
	}
	
	public static boolean validOrInvalid(int numberOfDeliveries){
		return numberOfDeliveries < 1 || numberOfDeliveries > 100;
	}

	public static int amountPerParcel(int numberOfDeliveries){
		int parcelAmount = 0;
		if (numberOfDeliveries < 50) parcelAmount = 160;

		else if(numberOfDeliveries == 50 && numberOfDeliveries < 60) parcelAmount =  200;
		else if(numberOfDeliveries == 60 && numberOfDeliveries < 70) parcelAmount =  250;
		else if(numberOfDeliveries >= 70) parcelAmount =  500;
		else numberOfDeliveries = 0;
		return parcelAmount ;

	}
	public static int checkDailyWage(int numberOfDeliveries){
		int basePay = 5000;
	
		int expectedAmount = 0;
		expectedAmount = numberOfDeliveries * amountPerParcel(numberOfDeliveries) + basePay;
		return expectedAmount;

	}
	}





















