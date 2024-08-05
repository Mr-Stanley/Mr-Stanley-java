import java.util.Arrays;


public class largestElement{
public static void main(String...args){

	int [] number = {1, 10, 16, 19, 20, 15, 13, 11, 18};
	int  sorted = large(number);

	System.out.print(sorted);


}
	public static int large(int [] number){
	int largestNumber = number [0];

	for (int index = 1; index < number.length; index++){
	
	if (number[index] > largestNumber){
		largestNumber = number[index];	
	}
	}
		return largestNumber;
		
}
}