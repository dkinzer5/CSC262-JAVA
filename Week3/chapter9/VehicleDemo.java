public class VehicleDemo
{
    public static void main (String[] args)
    {
        // make car and airplane
        Car Mazda = new Car("Mazda", 200, 8);
        Airplane Boeing = new Airplane("Boeing", 490, 2 );

        if(Mazda.getMax_speed() > Boeing.getMax_speed())
        {
            System.out.printf("Wow, the mazda is somehow faster than the airplane%n" +
                    "Mazda Top Speed: %d%n" +
                    "Boeing Top Speed %d%n",
                    Mazda.getMax_speed(),
                    Boeing.getMax_speed());
        }
        else
        {
            System.out.printf("Of course the airplane is faster%n" +
                    "Mazda Top Speed: %d%n" +
                    "Boeing Top Speed %d%n",
                    Mazda.getMax_speed(),
                    Boeing.getMax_speed());
        }

        // Even tho thehomework question only says to make the toString overides but
        // it never actually says to use them I am doing it anyways
        System.out.println();
        System.out.println(Mazda.toString());
        System.out.println(Boeing.toString());

    }



}
