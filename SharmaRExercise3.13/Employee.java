

public class Employee
{
    //instance variables
    private String firstName;
    private String lastName;
    private double monthlySalary;
    double Raise; 
    
    //constructor to initialize the variables
    public Employee(String firstName, String lastName, double monthlySalary)
    {
        this.firstName =firstName;
        this.lastName=lastName;
        //this.monthlySalary = monthlySalary;
        
        if(monthlySalary > 0) 
        {
        	this.monthlySalary = monthlySalary;
        }
    }
    //getter methods
    public String getFirstName() 
    {
        return firstName;
    }
    public String getLastName() 
    {
        return lastName;
    }
    public double getMonthlySalary() 
    {
        return monthlySalary;
    }
    //setter methods
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }
    public void setMonthlySalary(double salary) 
    {   
    	//condition to check if salary is positive or not
        if (salary > 0) 
        {
            this.monthlySalary = salary;
        }

    }
    public double getRaise() 
    {
    	double Raise = (getMonthlySalary() * .10) + getMonthlySalary();
    	return Raise; 
    			
    }

    
    
}
