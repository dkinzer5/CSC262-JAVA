import java.util.Scanner;
import java.lang.Character;

public class convertTest
{
    public static void main(String[] args)
    {
        char userType;
        double userValue = 0.0;

        //  make an input Scanner
        Scanner input = new Scanner(System.in);

        // make a tempConverter object
        tempConverter converter = new tempConverter();

        // Ask for unit type and store
        System.out.print("Please indicated whether Celsius(C) or Fahrenheit(F): ");
        userType =  Character.toUpperCase(input.nextLine().charAt(0));

        // Ask for value
        System.out.print("Please enter a degree: ");
        userValue = input.nextDouble();

        // Return appropriately
        if (userType == 'F')
        {
            System.out.printf("%.2f\u00b0F %n%.2f\u00b0C",userValue, converter.celsius(userValue) );
        }
        else
        {
            System.out.printf("%.2f\u00b0C %n%.2f\u00b0F",userValue, converter.fahrenheit(userValue) );
        }
    }
}
