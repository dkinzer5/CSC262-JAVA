public class Vehicle
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
    *       Private DATA
    *************************************/
    private String name;
    private int max_speed;
}
