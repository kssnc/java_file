import java.util.Random;

public class Generator_pin {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random random = new Random();

        // Generate a 4-digit PIN
        int pin = 1000 + random.nextInt(9000); // Ensures the PIN is always 4 digits

        // Print the generated PIN
        System.out.println("Generated PIN: " + pin);
    }
}
