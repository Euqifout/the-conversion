package theconversion ;
 
import java.util.Scanner;
 
public class theconversion {
 
    public static void main(String[] args) {
        // Prompt the user for the unit to convert from
        try (Scanner input = new Scanner(System.in)) {
            // Prompt the user for the unit to convert from
            System.out.println("Enter the unit you want to convert from (Feet, Pounds, Fahrenheit):");
            String fromUnit = input.nextLine().toLowerCase();
            // Prompt the user for the unit to convert to
            System.out.println("Enter the unit you want to convert to (Meters, Kilograms, Celsius):");
            String toUnit = input.nextLine().toLowerCase();
            // Prompt the user for the quantity to convert
            System.out.println("Enter the quantity to be converted:");
            while (!input.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                input.next(); // Clear the invalid input
            }   double quantity = input.nextDouble();
            // Perform the conversion
            double result = 0;
            boolean validConversion = true;
            switch (fromUnit) {
                case "feet" -> {
                    if (toUnit.equals("meters")) {
                        result = quantity * 0.305;
                    } else {
                        validConversion = false;
                    }
                }
                case "pounds" -> {
                    if (toUnit.equals("kilograms")) {
                        result = quantity * 0.454;
                    } else {
                        validConversion = false;
                    }
                }
                case "fahrenheit" -> {
                    if (toUnit.equals("celsius")) {
                        result = (quantity - 32) * (5.0 / 9.0);
                    } else {
                        validConversion = false;
                    }
                }
                default -> validConversion = false;
            }   // Print the result of the conversion or an error message if the conversion is not valid
            if (validConversion) {
                System.out.println(quantity + " " + fromUnit + " is equal to " + result + " " + toUnit);
            } else {
                System.out.println("Invalid conversion units.");
            }
            // Close the scanner
        }
    }

    @Override
    public String toString() {
        return "Main []";
    }
}