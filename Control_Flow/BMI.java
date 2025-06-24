import java.util.Scanner;


public class BMI {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // User input for weight and height
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = scanner.nextDouble();

        // Convert cm to meters
        double heightM = heightCm / 100.0; 
        double bmi = weight / (heightM * heightM);
        System.out.printf("BMI is: %.2f\n", bmi);
        
        // Determine weight status
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        scanner.close();
    }
}
