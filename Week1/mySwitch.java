import java.util.Scanner;

public class mySwitch
{
    public static void main(String[] args)
    {
        // make a Scanner for input
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a character: ");
        char userInput = input.next().charAt(0);

        switch (userInput)
        {
            case 'a':
            case 'A':
                System.out.println("High Quality");
                break;
            case 'b':
            case 'B':
                System.out.println("Medium Quality");
                break;
            case 'c':
            case 'C':
                System.out.println("Low Quality");
                break;
            default:
                System.out.println("Error: Unknown Code");
        }
    }
}
