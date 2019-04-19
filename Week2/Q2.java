import java.util.Arrays;

public class Q2
{
    public static void main(String[] args)
    {
        // part (a)
        int[] counts = new int[10];
        Arrays.fill(counts, 0);

        // part (b)
        int[] bonus = new int[15];
        for(int i = 0; i < bonus.length; i++)
        {
            bonus[i] = i + 1;
        }

        // part(c)
        int[] bestScores = new int[]{5, 15, 67, 87, 98};
        for(int i = 0; i<bestScores.length; i++)
        {
            System.out.println(bestScores[i]);
        }



    }
}

