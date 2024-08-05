import java.util.*;
public class Twelvedays {
	public static void main(String []args) {
	Scanner input = new Scanner(System.in);

	for (int i = 1; i <= 12; i++) {
	System.out.println(" on the " + i + "days of Christmas: ");

	switch (i) {
	case 12: System.out.println(" A partridge in a pear tree");
	break:
	case 11: System.out.println(" Two turtle doves");
	break:
	case 10: System.out.println("Three French hens");
	break:
	case 9: System.out.println(" Four calling birds");
	break:
	case 8: System.out.println(" Five golden rings");
	break:
	case 7: System.out.println(" Six geese a-laying");
	break:
	case 6: System.out.println(" Seven swans a-swimming");
	case 5: System.out.println(" Eight maids a-milking");
	case 4: System.out.println(" Nine ladies dancing");
	case 3: System.out.println(" Ten lords a-leaping");
	case 2: System.out.println(" Eleven pipers piping");
	case 1: System.out.println(" Twelve drummers drumming");
	
System.out.println();
	}
}
}
}