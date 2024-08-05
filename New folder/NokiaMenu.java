import java.util.Scanner;
	public class NokiaMenu {
	public static void main(String []args) {

	Scanner input = new Scanner(System.in);

	System.out.println(" NOKIA MENU");

	System.out.println("1. Phone Book");

	System.out.println("2. Messages");

	System.out.println("3. Chats");

	System.out.println("4. Call Register");

	System.out.println("5. Tones");

	System.out.println("6. Settings");

	System.out.println("7. Call Divert");

	System.out.println("8. Games");

	System.out.println("9. Calculator");

	System.out.println("10. Reminders");

	System.out.println("11. Clock");

	System.out.println("12. Profiles");

	System.out.println("13. Sim Services");
	
			
   			System.out.println(" Select a number to continue ");

			int Phonebook = input.nextInt();

			switch (Phonebook) {

			case 1: System.out.println(" Phone Book ");

				System.out.println("\n 1. Search\n 2. Service Nos\n 3. Add Name\n 4. Erase\n 5. Edit\n 6. Assign tone\n 7. Send b'card\n 8. options\n 9. Speed dials\n 10. Voice tags");

				System.out.println(" Select a number to continue ");

				int number = input.nextInt();

				switch (number){

			case 1: System.out.println(" Search ");
				break;

			case 2: System.out.println(" Service Nos ");
				break;

			case 3: System.out.println(" Add Name ");
				break;

			case 4: System.out.println(" Erase ");
				break;

			case 5: System.out.println(" Edit ");
				break;

			case 6: System.out.println(" Assign tone ");
				break;

			case 7: System.out.println(" Send b'card ");
				break;

			case 8: System.out.println(" options ");

				System.out.print("\n 1. Type of view\n 2. Memory status");

				System.out.println(" Enter a number to continue ");

				int user = input.nextInt();

				switch (user){

			case 1: System.out.println(" Type of view");
			 	break;

			case 2: System.out.println(" Memory status");
				break;

				default: System.out.print("Invalid");
}
			        break;

			case 9: System.out.println(" Speed dials");
					break;

			case 10: System.out.println(" Voice tags");
				break; 

				default: System.out.println("Invalid");
				
}
				break;
			case 2: System.out.println(" Messages");

				System.out.print("\n 1. Write message\n 2. Inbox\n 3. Outbox\n 4. Picture messages\n 5. Templates\n 6. Smiley\n 7. Message settings\n 8. info service\n 9. Voice mailbox number\n 10. Service command editor");

				System.out.print(" Select a number to continue");

				int message = input.nextInt();

				switch (message) {

			 case 1: System.out.println(" Write message");
				break;

			case 2: System.out.println(" Inbox ");
				break;

			case 3: System.out.println(" Outbox");
				break;

			case 4: System.out.println(" Picture message");
				break;

			case 5: System.out.println(" Templates");
				break;

			case 6: System.out.println(" Smileys");
				break;

			case 7: System.out.println(" Message settings");

				System.out.println("\n 1. Set\n 2. Common");

				System.out.println(" Select a number to continue");

				int MessageSettings = input.nextInt();
					
				switch (MessageSettings){

			case 1: System.out.println("\n 1. Message centre Number\n 2. Message sent as\n 3. Message validity ");

				int case7Input = input.nextInt();

				switch (case7Input){
					
			case 1:	System.out.println(" Message centre number");
				break;
			case 2:	System.out.println(" Message sent as");
				break;
			case 3: System.out.println(" Message validity");
}
				break;
			      
			case 2: System.out.println("\n 1. Delivery reports\n 2. Reply via same centre\n 3. Character support ");

				int common = input.nextInt();

				switch (common){
					
			case 1:	System.out.println(" Delivery report");
				break;

			case 2:	System.out.println(" Reply via same centre");
				break;

			case 3: System.out.println(" Character support");
				break;
}
}
			default : System.out.println(" Invalid");
			        break;
			
			case 8: System.out.println(" Info service");
				 break;

			case 9: System.out.println(" Voice mailbox number");
				break;

			case 10: System.out.println(" Service command editor");
				break;
}
			default : System.out.println(" Invalid");
				 break;
				

			case 3:	System.out.println(" Chats");

				System.out.println(" 1. Chats");

				System.out.print(" Select a number to continue");

				int Chats = input.nextInt();
				
				switch (Chats) {

			case 1: System.out.println(" Chats");
				break;
}
				break;

			case 4:	System.out.println(" Call register");

				System.out.println("\n 1. Missed calls\n 2. Received Calls\n 3. Dialled numbers\n 4. Erase recent call lists\n 5. Show call duration\n 6. Call cost settings\n 7. prepaid credit");

				System.out.println(" Select a number to continue");

				int callRegister = input.nextInt();

				switch (callRegister){

			case 1: System.out.println(" Missed calls");
				break;

			case 2: System.out.println(" Received calls");
				break;

			case 3: System.out.println(" Dialled numbers");
				break;

			case 4: System.out.println(" Erase recent call lists");
				break;

			case 5: System.out.println(" Show call duration");

				System.out.println("\n 1. Last call duration\n 2. All calls duration\n 3. Received calls duration\n 4. Dialled calls duration\n 5. Clear timers");

				System.out.print(" Select a number to continue");

				int showCallDuration = input.nextInt();
				
				switch (showCallDuration){
			
			case 1: System.out.println(" Last call duration");
			        break;

			case 2: System.out.println(" All calls duration");
				break;

			case 3: System.out.println(" Received calls duration");
				break;

			case 4: System.out.println(" Dialled calls duration");
				break;

			case 5: System.out.println(" Clear timers");
				break;		
}
		                break;
			case 6: System.out.println(" Show call cost");

				System.out.println("\n 1. Last call cost\n 2. All costs cost\n 3. Clear counters");

				System.out.print(" Select a number to continue");

				int showCallCost = input.nextInt();
				
				switch (showCallCost) {

			case 1: System.out.println(" Last call cost");
				break;

			case 2: System.out.println(" All calls cost");
				break;
	
			case 3: System.out.println(" Clear counters");
				break;
}
				break;
			case 7: System.out.println(" Cost call settings");

				System.out.println("\n 1. Call cost limit\n 2. Show costs in");

				System.out.print(" Select a number to continue");

				int costCallSettings = input.nextInt();
				
				switch (costCallSettings) {

			case 1: System.out.println(" Call cost limit");
				break;

			case 2: System.out.println(" Show cost in");
				break;
}
				break;
			case 8: System.out.println(" Prepaid credit");
				break;
}
				break;

			case 5:	System.out.println(" Tones");

				System.out.println("\n 1. Ringing tone\n 2. Ringing volume\n 3. Incoming call alert\n 4. Composer\n 5. Message alert tone\n 6. Keypad tones\n 7. Warning and game tones\n 8. Vibrating alert\n 9. Screen saver");

				System.out.println(" Select a number to continue ");

				int tones = input.nextInt();
				
				switch (tones) {

			case 1: System.out.println(" Ringing tone");
				break;

			case 2: System.out.println(" Ringing volume");
				break;

			case 3: System.out.println(" Incoming call alert");
				break;

			case 4: System.out.println(" Composer");
				break;

			case 5: System.out.println(" Message alert tone");
				break;

			case 6: System.out.println(" Keypad tones");
				break;

			case 7: System.out.println(" Warning and game tones");
				break;

			case 8: System.out.println(" Vibrating alert");
				break;

			case 9: System.out.println(" Screen saver");
				break;
}
				break;
	
			case 6:	System.out.println(" Settings");

				System.out.println("\n 1.Call settings\n 2. Phone settings\n 3. Security settings\n 4. Restore factory settings");

                                System.out.print(" Select a number to continue");

				int case6 = input.nextInt();
				
				switch (case6) {

			case 1: System.out.println(" Call settings");

				System.out.println("\n 1. Automatic redial\n 2. Speed dialing\n 3. Call waiting options\n 4. Own number sending\n 5. Phone line in use\n 6. Automatic answer");

				System.out.print(" Select a number to continue");

				int callSetting = input.nextInt();
				
				switch (callSetting) {

			case 1: System.out.println(" Automatic redial");
				break;

			case 2: System.out.println(" Speed dialing");
				break;

			case 3: System.out.println(" Call waiting");
				break;

			case 4: System.out.println(" Own number sending");
				break;

			case 5: System.out.println(" Phone line in use");
				break;

			case 6: System.out.println(" Automatic answer");
				break;				
}
				break;
			case 2: System.out.println(" Phone settings");

				System.out.println("\n 1. Language\n 2. Cell info display\n 3. Welcome note\n 4. Network selection\n 5. Lights\n 6. Comfirm SIM service actions");

				System.out.print(" Select a number to continue");

				int phoneSettings = input.nextInt();
				
				switch (phoneSettings) {

			case 1: System.out.println(" Language");
				break;

			case 2: System.out.println(" Cell info display");
				break;

			case 3: System.out.println(" Welcome note");
				break;

			case 4: System.out.println(" Network selection");
				break;

			case 5: System.out.println(" Lights");
				break;

			case 6: System.out.println(" Comfirm SIM service actions");
				break;	
}
			case 3: System.out.println(" Security settings");

				System.out.println("\n 1. Pin code request\n 2. Call baring service\n 3. Fixed dialing\n 4. Closed user group\n 5. Phone security\n 6. Change access codes");

				System.out.print(" Select a number to continue");

				int securitySetting = input.nextInt();
	
				switch (securitySetting) {

			case 1: System.out.println(" Pin code request");
				break;

			case 2: System.out.println(" Call baring service");
				break;

			case 3: System.out.println(" Fixed dialing");
				break;

			case 4: System.out.println(" Closed user group");
				break;

			case 5: System.out.println(" Phone security");
				break;

			case 6: System.out.println(" Change access codes");
				break;	
}
				break;
			case 4: System.out.println(" Restore factory settings");

				System.out.println(" 1. Restore factory settings");

				System.out.print(" Select a number to continue");

				int restoreFacSet = input.nextInt();
				
				switch (restoreFacSet) {

			case 1: System.out.println(" Restore factory settings");
				break;
}
				break;
		
}
			case 7:	System.out.println(" Call divert");

				System.out.println(" 1. Call divert");

				System.out.print(" Select a number to continue");

				int callDivert = input.nextInt();
				
				switch (callDivert) {

			case 1: System.out.println(" Call Divert");
				break;
}
				break;
			
			case 8: System.out.println(" Games");

				System.out.println(" 1. Games");

				System.out.print(" Select a number to continue");

				int Games = input.nextInt();
				
				switch (Games) {

			case 1: System.out.println(" Games");
				break;
}
				break;

			case 9: System.out.println(" Calculator");

				System.out.println(" 1. Calculator");

				System.out.print(" Select a number to continue");

				int Calculator = input.nextInt();
				
				switch (Calculator) {

			case 1: System.out.println(" Calculator");
				break;
}
				break;

			case 10: System.out.println(" Reminders");

				System.out.println(" 1. Reminders");

				System.out.print(" Select a number to continue");

				int Reminders = input.nextInt();
				
				switch (Reminders) {

			case 1: System.out.println(" Reminders");
				break;
}
				break;

			case 11: System.out.println(" Clock");
				 
				System.out.println("\n 1. Alarm clock\n 2. Clock settings\n 3. Date settings\n 4. Stopwatch\n 5. Countdown timer\n 6. Auto update of date and time");

				System.out.print(" Select a number to continue");

				int Clock = input.nextInt();
	
				switch (Clock) {

			case 1: System.out.println(" Alarm clock");
				break;

			case 2: System.out.println(" Clock settings");
				break;

			case 3: System.out.println(" Date settings");
				break;

			case 4: System.out.println(" Stopwatch");
				break;

			case 5: System.out.println(" Countdown timer");
				break;

			case 6: System.out.println(" Auto update of time and date");
				break;	
}
				break;
			
			case 12: System.out.println(" Profiles");

 				 System.out.println(" 1. Profiles");

				System.out.print(" Select a number to continue");

				int Profiles = input.nextInt();
				
				switch (Profiles) {

			case 1: System.out.println(" Profiles");
				break;
}
				break;

			case 13: System.out.println(" Sim Services");

				 System.out.println(" 1. Sim Services");

				System.out.print(" Select a number to continue");

				int SimServices = input.nextInt();
				
				switch (SimServices) {

			case 1: System.out.println(" Sim Services");
				break;
           }

       }
    }
}
	