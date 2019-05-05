public class TemperatureTooLow extends Exception
{
    public TemperatureTooLow()
    {
        super("Temperature is too low..");
    }

    public TemperatureTooLow(int temp)
    {
        super("Temperature is: " + temp + " which is too low");
    }
}
