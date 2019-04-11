import java.util.Scanner;

public class Q2
{
    public static void main(String [] args)
    {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user for a number and store
        System.out.println("********* Welcome! *********");
        System.out.print("Please enter an integer: ");
        int myNumber = input.nextInt();

        // Determine if NEGATIVE, POSITIVE OR ODD
        if(myNumber < 0)
        {
            System.out.println("The number is negative");
        }
        else if(myNumber == 0)
        {
            System.out.println("The number is zero");
        }
        else
        {
            System.out.println("The number is positive");
        }

        // Say farewell
        System.out.println("********* Goodbye! *********");

    }

}