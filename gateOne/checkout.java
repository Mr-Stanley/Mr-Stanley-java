import java.util.Scanner;
import java.util.Arrays;

	public class CheckOut{
		public static void main(String [] args){
		
		Scanner Scanner = new Scanner(System.in);
		String [][] Products = {{"Rice", "2500" } , {"Beans","4500"}, { "Milk", "2900"}, {"Chocolate", "5100"} ,{"Sugar", "1200"}, {"Garri", "7500"}};
		
		System.out.println("Welcome To ObodUkwu Supermarket And Stores");
		System.out.println("Press Any Number to Add To Cart");
		System.out.print(Arrays.deepToString(Products));



		}


}