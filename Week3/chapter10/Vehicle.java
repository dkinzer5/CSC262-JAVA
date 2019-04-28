public abstract class Vehicle implements maintainable
{

    /*****************************************
     *       CONSTRUCTORS
     *****************************************/

    Vehicle(String name, int max_speed)
    {
        this.name = name;
        this.max_speed = max_speed;
    }

    Vehicle(){};
    /*****************************************
     *       ACCESSOR METHODS
     *****************************************/
    public String getName() { return this.name; }

    public int getMax_speed() { return this.max_speed; }

    /*****************************************
     *       MUTATOR METHODS
     *****************************************/
    public void setName(String name) {
        this.name = name;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }
    /************************************
     *       ABSTRACT METHOD
     *************************************/
    public abstract double runningCost(int hour);

    /************************************
     *       Override toString()
     **************************************/
    @Override
    public String toString()
    {
        String theString = String.format(
                "Name: %s%n" + "Max Speed: %d%n",
                getName(),
                getMax_speed());

        return theString;
    }
    /************************************
    *       Private DATA
    *************************************/
    private String name;
    private int max_speed;
}
