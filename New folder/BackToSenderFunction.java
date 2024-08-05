import java.util.Scanner;

	public class BackToSenderFunction {

		public static int isLessThan50Method(){
		Scanner input = new Scanner(System.in);

	System.out.print(" Enter the number of successful deliveries to calculate rider's pay for the day : ");
			int SuccessfulDeliveries = input.nextInt();

	
	if (SuccessfulDeliveries < 50){
		int BasePay = 5000;
		int calculatePay = SuccessfulDeliveries * 160;
		int dailyPay = calculatePay + BasePay;


	System.out.println(" The rider's pay for the day is " + dailyPay);
			break;

} 
	 
	
	public static int isBetween50And59Method(){
		Scanner input = new Scanner(System.in);

	System.out.print(" Enter the number of successful deliveries to calculate rider's pay for the day : ");
			int SuccessfulDeliveries = input.nextInt();

	int BasePay = 5000;
	int calculatePay;
	int dailyPay;

	if (SuccessfulDeliveries >= 50 && SuccessfulDeliveries <= 59){
		calculatePay = SuccessfulDeliveries * 200;
		dailyPay = calculatePay + BasePay;


	System.out.println(" The rider's pay for the day is " + dailyPay);
		break;

} 	

		
	
	public static int isBetween60And69Method(){
		Scanner input = new Scanner(System.in);

	System.out.print(" Enter the number of successful deliveries to calculate rider's pay for the day : ");
			int SuccessfulDeliveries = input.nextInt();

	int BasePay = 5000;
	int calculatePay;
	int dailyPay;

	if (SuccessfulDeliveries >= 60 && SuccessfulDeliveries <= 69){
		calculatePay = SuccessfulDeliveries * 250;
		dailyPay = calculatePay + BasePay;


	System.out.println(" The rider's pay for the day is " + dailyPay);
		break;

} 	

		


	public static int isBetween70AndAboveMethod(){
		Scanner input = new Scanner(System.in);

	System.out.print(" Enter the number of successful deliveries to calculate rider's pay for the day : ");
			int SuccessfulDeliveries = input.nextInt();

	int BasePay = 5000;
	int calculatePay;
	int dailyPay;

	if (SuccessfulDeliveries >= 70){
		calculatePay = SuccessfulDeliveries * 500;
		dailyPay = calculatePay + BasePay;


	System.out.println(" The rider's pay for the day is " + dailyPay);

} 	

		



    }
  }