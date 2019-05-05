public class Fridge
{
    private int temperature;

    /*****************************************************************
    *       SETTERS
    ******************************************************************/
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean tempNormal() throws TemperatureTooLow
    {
        if( temperature > 10)
        {
            return true;
        }
        else
        {
            throw new TemperatureTooLow(temperature);
        }
    }

}
