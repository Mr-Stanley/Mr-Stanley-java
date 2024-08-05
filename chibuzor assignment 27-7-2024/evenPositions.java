import java.util.Arrays;


public class evenPositions{
public static void main(String[] args){

	int [] number = {1, 10, 16, 19, 20, 15, 13, 11, 18};
	System.out.print(positions(number));

}
	public static int[] positions (int [] number){
	int size = (number.length + 1)/ 2;
	int [] result = new int[size];
	int evenplaces = 0;
	

	for (int index = 0; index < number.length; index++){
	if (index % 2 != 0){
	result[evenplaces++] = number[index];
	
	
}	
}	
	return result[evenplaces];
}
}