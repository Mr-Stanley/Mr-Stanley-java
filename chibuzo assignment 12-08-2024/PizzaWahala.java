import java.util.Scanner;
import java.util.ArrayList;
public class PizzaWahala{
	public static void main(String [] args){

		Scanner Scanner = new Scanner(System.in);	

	ArrayList<String> pizzaType = new ArrayList<String>();
	ArrayList<Integer> numberOfSlices = new ArrayList<Integer>();
	ArrayList<Integer> pricePerBox = new ArrayList<Integer>();


	pizzaType.add("Sapa Size");
	pizzaType.add("Small Money");
	pizzaType.add("Big Boys");
	pizzaType.add("Odogwu");
	
	
	numberOfSlices.add(4);
	numberOfSlices.add(6);
	numberOfSlices.add(8);
	numberOfSlices.add(12);

	
	pricePerBox.add(2000);
	pricePerBox.add(2400);
	pricePerBox.add(3000);
	pricePerBox.add(4200);




	System.out.println(pizzaType);
	System.out.println(numberOfSlices);
	System.out.println(pricePerBox);




		}
	}