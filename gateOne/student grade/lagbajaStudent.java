import java.util.Arrays;
import java.util.Scanner;

public class lagbajaStudent{
	public static void main(String...args){
	Scanner Scanner = new Scanner(System.in);

	
		System.out.print("How Many Students :");
		int numberOfStudents  = Scanner.nextInt();

		System.out.print(" How Many Subjects :");
		int numberOfSubjects  = Scanner.nextInt();
		System.out.println("Saving     >>>>>>>>>>>");
		System.out.println("Saved  Successfully");
		System.out.println();
		
		int [] total = new int [numberOfStudents];
		double [] average = new double [numberOfStudents];
		int [] position = new int [numberOfStudents];
		int [] [] lagbajaStudentsGrades = new int [numberOfStudents] [numberOfSubjects];
		int grade = 1;
		int num = 1;
		
	
			for (int count = 0; count < numberOfStudents; count++ ){
			int sum = 0;
			for (int counter = 0; counter < numberOfSubjects; counter++){
		
				System.out.println("Entering score for Student "+num);
				System.out.printf("Enter Subject %d score: ", grade);
				lagbajaStudentsGrades[count][counter] = Scanner.nextInt();
				System.out.println("Saving     >>>>>>>>>>>");
				System.out.println("Saved  Successfully");
				System.out.println();
				sum += lagbajaStudentsGrades[count] [counter];
				
				System.out.println();

				

				grade++;
				}
				total[count] = sum;
				average[count] = sum / numberOfSubjects;
				grade = 1;
				num++;
				
				
				
				System.out.println(Arrays.deepToString(lagbajaStudentsGrades));
					
				System.out.print("STUDENT  ");
		
			for(int counts = 1; counts <= numberOfSubjects; counts++){
				System.out.printf("%10s", "SUB" +counts);

					
			System.out.printf("%10s%10s%10s%n", "TOTAL ", "AVERAGE ", "POSITION");
	
			for(int index = 0; counts = 1; index < numberOfSubjects; index++; counts++){
				System.out.print("Student "+ counts);
				
					
			for(int element = 0; element < numberOfSubjects; element++){
				System.out.printf("%10d", lagbajaStudentsGrades[index][element]);
						}
				System.out.printf("%8d%9.2f%10d", total[index], average[index], position[counts]);
				System.out.println();
					}
					}
					}
		}
	}