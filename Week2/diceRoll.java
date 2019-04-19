import java.util.Random;
import java.util.Arrays;
public class diceRoll
{
    public static void main(String[] args)
    {
        // Random object
        Random rand = new Random();

        int numDiceRolls = 36000000;
        int tally[] = new int[11]; // normalized index
        Arrays.fill(tally, 0); // init to 0

        int sum = 0;

        for(int i = 0; i< numDiceRolls; i++)
        {
            // random dice roll
            int die1 = rand.nextInt(6) + 1;
            int die2 = rand.nextInt(6) + 1;

            // get sum
            sum = die1 + die2;

            //tally the sums
            switch(sum)
            {
                case 2:
                    tally[0]++;
                    break;
                case 3:
                    tally[1]++;
                    break;
                case 4:
                    tally[2]++;
                    break;
                case 5:
                    tally[3]++;
                    break;
                case 6:
                    tally[4]++;
                    break;
                case 7:
                    tally[5]++;
                    break;
                case 8:
                    tally[6]++;
                    break;
                case 9:
                    tally[7]++;
                    break;
                case 10:
                    tally[8]++;
                    break;
                case 11:
                    tally[9]++;
                    break;
                case 12:
                    tally[10]++;
                    break;
                default:
                    break;
            }
        }

        // make an array of labels
        String[] labels = new String[] {"TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE"};

        // formatted print
        for(int i = 0; i < labels.length; i++)
        {
            System.out.printf("%-7s -> %d%n", labels[i], tally[i]);
        }
    }
}
