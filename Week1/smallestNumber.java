import java.util.Scanner;

public class smallestNumber
{
    public static void main(String[] args)
    {
        int number = 0; // current number being looked at
        int count = 0; // counter
        int smallest = 2147483647; // the smallest number so far initialized to the largest 32 bit number possible
        int myList[] = new int[10]; // the array

        // make an input Scanner
        Scanner input = new Scanner(System.in);

        do {
            //ask for a number
            System.out.print("Enter a number: ");

            // put it in the array
            myList[count] = input.nextInt();

            // increment counter
            count++;

        }while(count <10);

        // Assume first number is largest unless proven otherwise
        smallest = myList[0];

        // iterate through and compare each number
        for (int i = 1; i < myList.length; i++)
        {
            number = myList[i];
            if (number < smallest)
            {
                smallest = number;
            }
        }

        // Print largest number to screen
        System.out.printf("The smallest number is: %d%n", smallest);

    }
}
