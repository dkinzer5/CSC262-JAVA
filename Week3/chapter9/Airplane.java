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

    /************************************
     *       Override toString()
     **************************************/
    public String toString()
    {
        String theString = String.format(
                "Name: %s%n" + "Max Speed: %d%n" + "Engines: %d%n",
                getName(),
                getMax_speed(),
                number_of_engines());

        return theString;
    }
}
