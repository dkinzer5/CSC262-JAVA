public class EmployeeTest
{
    public static void main (String[] args)
    {
        // Instantiate 2 Employee objects
        Employee Dylan = new Employee();
        Employee David = new Employee();

        // Display yearly salary
        System.out.println("***************************************************************");
        System.out.printf("Dylan's yearly salary is : $%.2f%n",Dylan.getMonthlySalary() * 12);
        System.out.printf("David's yearly salary is : $%.2f%n",David.getMonthlySalary() * 12);

        // Give Dylan 10% raise
        double dylanRaise = Dylan.getMonthlySalary() + Dylan.getMonthlySalary() * .1;
        Dylan.setMonthlySalary(dylanRaise);

        // Give David 10% raise
        double davidRaise = David.getMonthlySalary() + David.getMonthlySalary() * .1;
        David.setMonthlySalary(davidRaise);

        // Display yearly salary after raise
        System.out.println("***************************************************************");
        System.out.printf("Dylan's yearly salary after 10%% raise is : $%.2f%n",Dylan.getMonthlySalary() * 12);
        System.out.printf("David's yearly salary after 10%% raise is : $%.2f%n",David.getMonthlySalary() * 12);
    }
}
