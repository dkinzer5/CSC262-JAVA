import java.util.Scanner;

public class Q3
{
    public static void main(String [] args)
    {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user for a number and store
        System.out.println("********* Welcome! *********");
        System.out.print("Please enter an integer: ");
        int myNumber = input.nextInt();

        // Determine if even or odd and display accordingly
        if(myNumber % 2 == 0)
        {
            System.out.printf("%d is even %n", myNumber);
        }
        else
        {
            System.out.printf("%d is odd %n", myNumber);
        }

        // Say farewell
        System.out.println("********* Goodbye! *********");

    }

}