import java.util.Arrays;
	public class OddPositions{

	public static int[] Positions (int [] number){
	
	int [] oddcounter = new int [number.length]; 
	for (int index = 0; index < number.length; index++){

	if (index % 2 != 0){
	oddcounter[index] = number[index];

}
}
	return oddcounter;
}

	

	public static void main(String[]args){

	int [] number = {10, 1, 11, 16, 19, 20, 15, 13, 11, 18};
	int [] sorted = Positions(number);
	
	System.out.print(Arrays.toString(sorted));

}

}











