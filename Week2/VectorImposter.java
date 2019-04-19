import java.util.ArrayList;
import java.util.Random;
public class VectorImposter
{
    public static void main(String [] args)
    {
        // make arrayList of ints
        ArrayList<Integer> al = new ArrayList<Integer>();

        // fill with 10 random ints
        Random rand = new Random();
        for (int i = 0; i<10; i++)
        {
            al.add(rand.nextInt(1000));

            // print the contents of al
            System.out.println(al.get(i));
        }

        // remove the first element of al
        al.remove(0);

        // print the number of elements in al
        System.out.printf("The number of elements in the array is: %d%n", al.size());

        // print the contents of al again
        for(int i = 0; i<al.size(); i++)
        {
            System.out.println(al.get(i));
        }

    }
}
