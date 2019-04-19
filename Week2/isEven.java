import java.util.Scanner;

public class isEven
{
    public static boolean isEven(int x)
    {
        if (x % 2 == 0)
        {
           return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        // Make a scanner for input
        Scanner input = new Scanner (System.in);

        // make a program stop flag
        boolean stop = false;
        int userEntry = 0;
        String result = " ";

        System.out.println("Welcome! This program can tell you if a number is odd or even. If you enter -1 the program will end");

        // go till user says stop
        while( !stop )
        {
            System.out.print("Enter a number: ");
            userEntry = input.nextInt();

            if(userEntry == -1)
            {
                stop = true;
            }
            else
            {
                if(isEven(userEntry))
                {
                    result = "Even";
                }
                else
                {
                    result = "Odd";
                }

                System.out.printf("%d is %s%n", userEntry,result);

            }

        }
    }


}
