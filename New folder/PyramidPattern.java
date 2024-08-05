public class PyramidPattern {
	public static void main (String []args) {

	int number = 20;
	int x = 0;

	for (int I = 1; I <= number; i++) {
	x = i - 1;
	
	for (int j = i; j <= number - 1; j++) {

		System.out.print(" ");
		System.out.print("  ");

	  for (int j = 0; j <= x; j++)
	     System.out.print((i + j) < 50
				? (i + j) + "  " 
				: (i + j) + " ");



	for (int j = 1; j <= x; j++)
	   System.out.print((i + x - j) < 50
				? (i + x - j) + "  "
				: (i + x - j) + " ");

	System.out.println();

      }
    }
  }
}