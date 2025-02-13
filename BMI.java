/*
 BMI (body mass index):w/h2
1 foot =0.3048m

Ex ::IBM=
61÷((5.8×0.3048)(5.8×0.3048))
=19.518386903070

1)Below 18.5  is underweight 
2)18.5 to 24.9 is Normalweight
3)25 to 29.9 is overweight 
4)30&above is obese
 */



import java.util.Scanner;

public class BMI{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for height in feet
        System.out.print("Enter your height in feet: ");
        double heightFeet = scanner.nextDouble();

        // Input for weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weightKg = scanner.nextDouble();

        // Convert height from feet to meters
        double heightMeters = heightFeet * 0.3048;

        // Calculate BMI
        double bmi = weightKg / (heightMeters * heightMeters);

        // Display BMI
        System.out.printf("Your BMI is: %.2f%n", bmi);

        // Categorize BMI
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Category: Normal weight");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }

        scanner.close();
    }
}
