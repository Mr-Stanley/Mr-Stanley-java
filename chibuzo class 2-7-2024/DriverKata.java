public class DriverKata {
	
	public static boolean isEven(int number) {
	if (number % 2 == 0) return true;
	return false;
       }

       public static boolean isPrimeNumber(int number) {
	if (number % 2 != 0 && number % 3 != 0) return true;
	return false;
	}
	
	public static int subtract(int firstNumber, int secondNumber) {
	return firstNumber - secondNumber;
	}

	public static float divide(float firstNumber, float secondNumber){
	return firstNumber / secondNumber;
	} 
	
	public static int factorOf(int Number1){
	int numberOfFactors = 1;
	for (int factor = 2; factor < Number1 / 2; factor++) {

	if (Number1 % factor == 0) { 
	numberOfFactors++;
	}

	}
	return numberOfFactors++;
}
	
}