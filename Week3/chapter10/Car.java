public class Car extends Vehicle implements maintainable
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
    @Override
    public String toString()
    {
        String theString = String.format(
                "Name: %s%n" + "Max Speed: %d%n" + "Cylinders: %d%n" + "Cost: %.2f",
                getName(),
                getMax_speed(),
                getNumber_of_cylinders(),
                COST_PER_CYLINDER_PER_HOUR);

        return theString;
    }
    /************************************
     *       ABSTRACT METHODS
     **************************************/
    public double runningCost(int hour)
    {
        return (hour * COST_PER_CYLINDER_PER_HOUR * number_of_cylinders);
    }

    public double maintenanceCost(double costPerUnit)
    {
        return costPerUnit * number_of_cylinders;
    }
    /************************************
     *       Private DATA
     **************************************/
    private int number_of_cylinders;
    private final double COST_PER_CYLINDER_PER_HOUR = 10.5;

}
