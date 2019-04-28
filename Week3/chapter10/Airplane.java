public class Airplane extends Vehicle
{

    Airplane(String name, int max_speed, int engines)
    {
        super(name, max_speed);
        this.number_of_engines = engines;
    }

    /*****************************************
     *       ACCESSOR METHODS
     *****************************************/
    public int number_of_engines() { return number_of_engines; }

    /*****************************************
     *       MUTATOR METHODS
     *****************************************/
    public void setNumber_of_engines(int number_of_engines) {
        this.number_of_engines = number_of_engines;
    }

    /************************************
     *       Private DATA
     **************************************/
    private int number_of_engines;
    private final double COST_PER_ENGINE_PER_HOUR = 25.3;

    /************************************
     *       Override toString()
     **************************************/
    @Override
    public String toString()
    {
        String theString = String.format(
                "Name: %s%n" + "Max Speed: %d%n" + "Engines: %d%n" + "Cost: %.2f",
                getName(),
                getMax_speed(),
                number_of_engines(),
                COST_PER_ENGINE_PER_HOUR);

        return theString;
    }
    /************************************
     *       ABSTRACT methods
     **************************************/

    public double runningCost(int hour)
    {
        return hour * COST_PER_ENGINE_PER_HOUR * number_of_engines;
    }

    public double maintenanceCost(double costPerUnit)
    {
        return costPerUnit * number_of_engines;
    }

}
