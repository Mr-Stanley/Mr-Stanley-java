import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

	public class MenstrualApp {
		public static void main(String [] args){
		Scanner Scanner = new Scanner(System.in);
		DateTimeFormatter myDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		int averageAgeWomenStartMenstruating = 12;
		int averageAgeWomenStopMenstruating = 51;
		System.out.println("What is your Name : ");
			String userName = Scanner.next();
		System.out.println("How Old Are You : ");
			int ageOfUser = Scanner.nextInt();
		if(ageOfUser >= averageAgeWomenStopMenstruating){
			System.out.println("You're at Menopause, You Can't Have Periods");
			}
		else if(ageOfUser < averageAgeWomenStartMenstruating){
			System.out.println("You're not Old Enough, Go And Meet Your Mother Osiso");
			}
		else{
		System.out.println("Enter start date of your Last Menstrual period");
		System.out.println("use the format yyyy-MM-DD : ");
			String lastStartDate = Scanner.next();
			LocalDate lastStartDateEntered = LocalDate.parse(lastStartDate, myDate);

		System.out.println("On the average, how long is your Menstrual Cycle: ");
			int cycleLength= Scanner.nextInt();

		System.out.println("Enter Your last Menstrual duration(In Days): ");
			int menstrualDuration = Scanner.nextInt();

		System.out.println("====================================================================================");
		
		System.out.println("Dear," + userName + " " + "Your Estimated Flow Calender are as Follows : ");

			LocalDate nextStartdate = lastStartDateEntered.plusDays(cycleLength);

			LocalDate nextEnddate = nextStartdate.plusDays(menstrualDuration - 1);
		System.out.println("The Predicted date for your next period is " + nextStartdate + " to " + nextEnddate);

			LocalDate ovulationStartdate = lastStartDateEntered.plusDays((cycleLength/2) -2);

			LocalDate ovulationEnddate = ovulationStartdate.plusDays(1);
		System.out.println("The predicted Ovulation Date is " + ovulationStartdate + " to " + ovulationEnddate);

			LocalDate safePeriodStart = lastStartDateEntered.plusDays((cycleLength/2) + 2);

			LocalDate safePeriodEnd = safePeriodStart.plusDays((cycleLength/2) - 1);
		System.out.println("The predicted Safe Period is " + safePeriodStart + " to " + safePeriodEnd);
		System.out.println("===================================================================================");


				
		}
	}
}