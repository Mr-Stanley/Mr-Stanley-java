import java.util.Scanner;
public class Numberofoccurance{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int num =0;
	int larg =0;
	int repeat=0;
	
	System.out.print("Enter number: ");
	do {
		num = input.nextInt();
		if(num>larg) {
			repeat = 0;
			larg=num;
	}
		if(num==larg) {
			repeat++;
	}
	}while(num !=0);

	System.out.println("largest num:" +larg);
	System.out.print("repeated" + repeat);
	}
}