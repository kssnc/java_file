import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the upper limit (num) from the user
        System.out.print("Enter the upper limit for the random number: ");
        
        // Check if the input is a valid number
        String input = scanner.nextLine();
        int numLimit;

        try {
            numLimit = Integer.parseInt(input);
            
            // Validate if the number is greater than 0
            if (numLimit <= 0) {
                System.out.println("Please enter a number greater than 0.");
                return;  // Exit if invalid input
            }

        } catch (NumberFormatException e) {
            // If the input is not a number, display this message
            System.out.println("Please enter a number (1 to " + input + ")");
            return;  // Exit if input is not a valid number
        }

        // Generate a random number between 1 and numLimit (inclusive)
        Random random = new Random();
        int randomNumber = random.nextInt(numLimit) + 1;  // Adding 1 to ensure it's between 1 and numLimit

        int userGuess = 0;

        // Start the guessing loop
        while (userGuess != randomNumber) {
            System.out.print("Guess the number between 1 and " + numLimit + ": ");
            userGuess = scanner.nextInt();

            // Check if the guess is correct or if it's above or below the random number
            if (userGuess == randomNumber) {
                System.out.println("You got it!");
            } else if (userGuess < randomNumber) {
                System.out.println("You're below the number!");
            } else {
                System.out.println("You're above the number!");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
