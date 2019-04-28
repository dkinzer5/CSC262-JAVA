public class VehicleDemo
{
    public static void main (String[] args) {
        // make car and airplane
        Car Mazda = new Car("Mazda", 200, 8);
        Airplane Boeing = new Airplane("Boeing", 490, 2);

        // METHOD CALLS FOR CAR
        String theString = String.format(
                "Name: %s%n" + "Max Speed: %d%n" + "Cylinders: %d%n",
                Mazda.getName(),
                Mazda.getMax_speed(),
                Mazda.getNumber_of_cylinders());
        System.out.println(theString);

        System.out.println();

        // METHOD CALLS FOR AIRPLANE
        String theString2 = String.format(
                "Name: %s%n" + "Max Speed: %d%n" + "Engines: %d%n",
                Boeing.getName(),
                Boeing.getMax_speed(),
                Boeing.number_of_engines());
        System.out.println(theString2);

        System.out.println();

        // RUNNING COST
        System.out.print("Mazda running cost is: ");
        System.out.println(Mazda.runningCost(5));
        System.out.print("Boeing running cost is: ");
        System.out.println(Boeing.runningCost(5));

        System.out.println();

        // MAINTENANCE COST
        System.out.print("Mazda maintenance cost: ");
        System.out.println(Mazda.maintenanceCost(30.0));
        System.out.print("Boeing maintenance cost: ");
        System.out.println(Boeing.maintenanceCost(250.0));

        System.out.println();
        Vehicle v1 = new Car("chevy", 150, 6);
        System.out.println(v1.toString());
    }

    /*
    * The v1 is a reference variable to a VEHICLE but it instantiates a Car object. Therefore when the toString() method of v1 is called it first calls my Vehicle toString() override and thereafter calls the Car toString() override. This is why we see all the available information of the car plus it's superclass vehicle
    * information. I THINK this is called polymorphism because one method call takes on 2 different forms. THE CAR and THE VEHICLE. 
    *
    * */
}
