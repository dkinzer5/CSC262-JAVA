public class Car extends Vehicle
{
    Car(String name, int max_speed, int cylinders)
    {
        super(name, max_speed);
        this.number_of_cylinders = cylinders;
    }

    /*****************************************
     *       ACCESSOR METHODS
     *****************************************/
    public int getNumber_of_cylinders() { return number_of_cylinders; }

    /*****************************************
     *       MUTATOR METHODS
     *****************************************/
    public void setNumber_of_cylinders(int number_of_cylinders) {
        this.number_of_cylinders = number_of_cylinders;
    }
    /************************************
     *       Override toString()
     **************************************/
    public String toString()
    {
        String theString = String.format(
                "Name: %s%n" + "Max Speed: %d%n" + "Cylinders: %d%n",
                getName(),
                getMax_speed(),
                getNumber_of_cylinders());

        return theString;
    }
    /************************************
     *       Private DATA
     **************************************/
    private int number_of_cylinders;

}
