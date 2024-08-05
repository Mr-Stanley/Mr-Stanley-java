import java.util.Arrays;


public class totalOfAList{
public static void main(String[] args){

	int [] number = {1, 10, 16, 19, 20, 15, 13, 11, 18};
	System.out.print(large(number));

}
	public static int large(int [] number){
	int total = 0;

	for (int index = 0; index < number.length; index++){
	
	total += number[index];
	}
		return total;
		
}
}