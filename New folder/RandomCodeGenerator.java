import java.util.Random;
import java.util.Scanner;

public class RandomCodeGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose code type:");
        System.out.println("1. Random Number (Integer)");
        System.out.println("2. Random String (Alphanumeric)");
        System.out.println("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        // Generate random number (Integer)
        if (choice == 1) {
            Random random = new Random();
            int min = 1; // Set minimum value (inclusive)
            int max = 100; // Set maximum value (exclusive)
            int randomNumber = random.nextInt(max - min) + min;
            System.out.println("Generated Random Number: " + randomNumber);
        }

        // Generate random string (Alphanumeric)
        else if (choice == 2) {
            StringBuilder sb = new StringBuilder();
            int length = 10; // Set string length

            String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            Random random = new Random();

            for (int i = 0; i < length; i++) {
                int index = random.nextInt(alphabet.length());
                char randomChar = alphabet.charAt(index);
                sb.append(randomChar);
            }

            String randomString = sb.toString();
            System.out.println("Generated Random String: " + randomString);
        }

        // Handle invalid choice
        else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }
}
