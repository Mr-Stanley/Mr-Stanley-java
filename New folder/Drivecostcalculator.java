import java.util.Scanner; 

public class Drivecostcalculator{
	public static void main(String []args){
	// Create a Scanner object to read inputs from the user
	Scanner input = new Scanner(System.in);

	//Enter the value for the distance 
	System.out.print("Enter Distance:");
	int distance = input.nextInt();

	//Enter the value for fuel efficiency
	System.out.print("Enter Fuel Efficiency:");
	int fuelEfficiency = input.nextInt();
	
	//Enter the value for the cost of fuel per gallon
	System.out.print("Enter the Price of Fuel:");
	int costoffuel = input.nextInt();

	
	
	//Divide the distance by the fuel efficiency
	System.out.print("Total Fuel Needed:");
	int totalFuel = (distance / fuelEfficiency);

	//Multiply the total cost of fuel by the total miles covered by each gallon
	System.out.print("Total cost:");
	int totalCost = (costoffuel * fuelEfficiency);
	
	System.out.printf("Total cost is %d%n", totalCost);

   }
 }
		