# the-conversion
UnitConversionProject
Description
UnitConversionProject is a simple Java application that converts units from Feet, Pounds, and Fahrenheit to Meters, Kilograms, and Celsius, respectively. This project demonstrates basic console input/output operations, condition handling, and unit conversion logic.

## How to Use
Clone the Repository:
git clone https://github.com/yourusername/UnitConversionProject.git

Navigate to the Project Directory:
cd UnitConversionProject

Compile the Java Program:
javac -d bin src/unitconversionproject/Main.java

Run the Program:
java -cp bin unitconversionproject.Main

## Usage Example

Prompt for Unit to Convert From:
Enter the unit you want to convert from (Feet, Pounds, Fahrenheit):

Input: Feet
Prompt for Unit to Convert To:
Enter the unit you want to convert to (Meters, Kilograms, Celsius):
Input: Meters

Prompt for Quantity to Convert:
Enter the quantity to be converted:
Input: 10

Output:
10 feet is equal to 3.05 meters

## Valid Conversions

Feet to Meters
Pounds to Kilograms
Fahrenheit to Celsius

## Error Handling

The program checks for invalid unit conversions and prints an error message if the conversion units are invalid.
The program ensures that the quantity entered is a numeric value and prompts the user again if the input is invalid.
