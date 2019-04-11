public class Employee
{
    // Private member data
    private String strm_firstName;
    private String strm_lastName;
    private double dm_monthlySalary = 5000;

    // ******** SETTER METHODS **********************
    public void setFirstName(String firstName)
    {
        strm_firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        strm_lastName = lastName;
    }

    public void setMonthlySalary(double salary)
    {
        if(dm_monthlySalary >= 0)
            dm_monthlySalary = salary;
    }

    // ******** GETTER METHODS **********************
    public String getFirstName()
    {
        return strm_firstName;
    }

    public String getLastName()
    {
        return strm_lastName;
    }

    public double getMonthlySalary()
    {
        return dm_monthlySalary;
    }
}
