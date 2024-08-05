public class BackToSenderSnack {
	public static int SnackFunction(int SuccessfulDeliveries){

	int BasePay = 5000;
	int calculatePay;
	int dailyPay = 0;

	if (SuccessfulDeliveries < 50){
		calculatePay = SuccessfulDeliveries * 160;
		dailyPay = calculatePay + BasePay;


	System.out.println(" The rider's pay for the day is " + dailyPay);

} 	
	else if (SuccessfulDeliveries >= 50 && SuccessfulDeliveries <= 59) {
		calculatePay = SuccessfulDeliveries * 200;
		dailyPay = calculatePay + BasePay;

	System.out.println(" The rider's pay for the day is " + dailyPay);
}
	
	else if (SuccessfulDeliveries >= 60 && SuccessfulDeliveries <= 69){
		calculatePay = SuccessfulDeliveries * 250;
		dailyPay = calculatePay + BasePay;

	System.out.println(" The rider's pay for the day is " + dailyPay);
}	

	else if (SuccessfulDeliveries >= 70) {
		calculatePay = SuccessfulDeliveries * 500;
		dailyPay = calculatePay + BasePay;

	System.out.println(" The rider's pay for the day is " + dailyPay);
}
		return dailyPay;

	

	


     }
   }