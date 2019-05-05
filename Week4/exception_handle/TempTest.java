public class TempTest
{
    public static void main(String[] args)
    {

        Fridge Samsung = new Fridge();
        Samsung.setTemperature(35);

        try
        {
            if(Samsung.tempNormal())
            {
                System.out.println("Temperature normal");
            }
        }
        catch(TemperatureTooLow t)
        {
            System.out.println("Temperature is too low..");
        }
        Samsung.setTemperature(8);
        try
        {
            if(Samsung.tempNormal())
            {
                System.out.println("Temperature normal");
            }
        }
        catch(TemperatureTooLow t)
        {
            System.out.println(t.getMessage());
        }


    }



}
