import java.util.Arrays;


public class reverseList{
	public static void main(String...args){

	int [] numbers = {10, 2, 9, 4, 1, 6, 7, 8, 3, 1};
	int [] alphabets = {a, b, c, d, e, f, g, h, i, j};
	
	int [] upside = reversing(numbers);

	System.out.print(Arrays.toString(upside));
}


	public static int [] reversing(int [] numbers){

	int [] reversedList = new int[ numbers.length];
	int counter = 0;

	for (int rev = numbers.length -1; rev >= 0; rev--){
	
		reversedList[counter] = numbers[rev];		
		counter++;
		}
		return reversedList;
	}
		
	
	}
