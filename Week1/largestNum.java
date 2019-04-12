import java.util.Scanner;

public class largestNum
{
    public static void main(String[] args)
    {
        int number = 0; // current number being looked at
        int count = 0; // counter
        int largest = 0; // the largest number so far
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
        largest = myList[0];

        // iterate through and compare each number
        for (int i = 1; i < myList.length; i++)
        {
            number = myList[i];
            if (number > largest)
            {
                largest = number;
            }
        }

        // Print largest number to screen
        System.out.printf("The largest number is: %d%n", largest);

    }
}
