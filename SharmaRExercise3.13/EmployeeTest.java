/*
 Use the supplied .java file(s) as the basis of your solution to the assignment. Note that, for the purposes of this course, 
 all classes are defined within the default package (in other words, they do not explicitly specify a package).

 This assignment must be submitted as a .zip file containing only your solution's .java files named following the convention 
 LastnameFirstInitialExercise#.zip where the '#' is the Exercise number.
 For example, my submission for this assignment would be named DukeGExercise3.13.zip). There should be no directories within the zip file.


 Expected test program (EmployeeTest.java) console (System.out) output:
 Benjamin Bernanke's yearly salary: 14814.72
 Paul Volcker's yearly salary: 28148.04
 Giving raises...
 Benjamin Bernanke's yearly salary: 16296.192000000001
 Paul Volcker's yearly salary: 30962.844
 Attempting to set a negative salary value...
 Benjamin Bernanke's yearly salary: 16296.192000000001
 */

public class EmployeeTest
{
    public static void main( String args[])
    {
    	//creating object of Employee
    	Employee emp1 = new Employee("Benjamin", "Bernanke", 14814.72);
    	Employee emp2 = new Employee("Paul", "Volcker", 28148.04);

    	//Displaying the objects
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + "'s monthly salary is " + emp1.getMonthlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + "'s monthly salary is " + emp2.getMonthlySalary());
        
        System.out.println("Giving Raises: ");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + "'s yearly salary: " + String.format("%.12f", emp1.getRaise()));
        //System.out.format("%.12f", emp1.getFirstName() + " " + emp1.getLastName() + "'s yearly salary: " + emp1.getRaise());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + "'s yearly salary: " +  String.format("%.3f",emp2.getRaise()));

        System.out.println("Attempting to set a negative salary value: ");        
        emp1.setMonthlySalary(-9.0); 
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + "'s yearly salary: " + String.format("%.12f", emp1.getRaise()));


    }
}
