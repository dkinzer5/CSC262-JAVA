import javax.naming.CannotProceedException;

public class BicycleTest
{
    public static void main(String[] args)
    {
        // make yourself some nice wheels
        Wheel firstWheel = new Wheel(1.0, 27.0);
        Wheel secondWheel = new Wheel(1.5, 28);

        // make yourself a nice bicycle - maybe a cannondale or trek?
        Bicycle CANNONDALE = new Bicycle(firstWheel, secondWheel, "Blue", 18);

        // print the values of the CANNONDALE
        System.out.printf(
                "This is a %s Cannondale, complete with %d gears!%n" +
                "WHEEL SPECS:%nFront -> width = %.2f, radius = %.2f%nBack -> width = %.2f, radius = %.2f%n",
                CANNONDALE.getBodyColor(),
                CANNONDALE.getNumberOfGears(),
                CANNONDALE.getWheelOne().getWidth(),
                CANNONDALE.getWheelOne().getRadius(),
                CANNONDALE.getWheelTwo().getWidth(),
                CANNONDALE.getWheelTwo().getRadius());

        // Changes gears to 21
        CANNONDALE.setNumberOfGears(21);

        // print the values of the CANNONDALE again
        System.out.printf(
                "%nThis is a %s Cannondale, complete with %d gears!%n" +
                        "WHEEL SPECS:%nFront -> width = %.2f, radius = %.2f%nBack -> width = %.2f, radius = %.2f%n%n",
                CANNONDALE.getBodyColor(),
                CANNONDALE.getNumberOfGears(),
                CANNONDALE.getWheelOne().getWidth(),
                CANNONDALE.getWheelOne().getRadius(),
                CANNONDALE.getWheelTwo().getWidth(),
                CANNONDALE.getWheelTwo().getRadius());

        // if new variables are not made, the IF statement would be entirely too long
        double frontRadius = CANNONDALE.getWheelOne().getRadius();
        double frontWidth = CANNONDALE.getWheelOne().getWidth();
        double backRadius = CANNONDALE.getWheelTwo().getRadius();
        double backWidth = CANNONDALE.getWheelTwo().getWidth();

        // compare radius and width to each other
        if((frontRadius == backRadius) &&(frontWidth == backWidth))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }


    }
}
