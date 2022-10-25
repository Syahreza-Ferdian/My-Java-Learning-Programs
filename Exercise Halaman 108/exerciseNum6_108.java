import java.util.Scanner;

public class exerciseNum6_108 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double weightPound, heightFeet, heightInches, weightKilo, heightMeters, bmi;

        final double POUND_TO_KILOGRAM = 0.45359237;
        final double FEET_TO_METERS = 0.3048;
        final double INCHES_TO_METERS = 0.0254;

        System.out.print("Enter weight in pounds: ");
        weightPound = scanner.nextDouble();
        System.out.print("Enter feet: ");
        heightFeet = scanner.nextDouble();
        System.out.print("Enter inches: ");
        heightInches = scanner.nextDouble();
        
        weightKilo = weightPound * POUND_TO_KILOGRAM;
        heightMeters = (heightFeet * FEET_TO_METERS) + (heightInches * INCHES_TO_METERS);
        bmi = weightKilo / Math.pow(heightMeters, 2);

        System.out.printf("BMI is %s\n", Double.toString(bmi));
        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi < 25) {
            System.out.println("Normal");
        }
        else if (bmi < 30) {
            System.out.println("Overweight");
        }
        else System.out.println("Obsese");
    }    
}
