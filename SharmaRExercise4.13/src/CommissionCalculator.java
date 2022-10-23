import java.util.Scanner;

/*
 * CommissionCalculator.java
 */

/**
 *
 * @author RohaniSharma
 */

public class CommissionCalculator 
{
    
    public static void main(String args[])
    {
        // Initialize a Scanner to read input from the command line

    	/* Note that we'll be doing this at least once and most likely multiple times...
    	 * Prompt the user with a menu of the four items and their values (this information is included in the problem statement)
    	 
    	System.out.println("Item\tValue");
        System.out.println("1\t$239.99");
        System.out.println("2\t$129.75");
        System.out.println("3\t$99.95");
        System.out.println("4\t$350.89"); 
        
        System.out.println("Current Compensation: " + compensation);
    	/* Display the user's current compensation
    	 * 
    	 * Prompt and take input from the user (you may assume that they will only enter int values)
    	 * They'll enter an item number (1 - 4) to record its sale or 0 to exit
    	 * 
    	 * NOTE: THE USER DOES NOT ENTER PRICES DIRECTLY... THEY ENTER ITEM NUMBERS TO INDICATE WHAT WAS SOLD
    	 * NOTE: THE USER MAY ENTER THE SAME ITEM NUMBRER MULTIPLE TIMES

    	 */
    	
    	/* After the user enters 0, display the salesperson's earnings in the format "Total earnings: $NNN.NN" and exit
    	 * For example, if the salesperson sold two item 3s this week the final output would be "Total earnings: $217.99"
    	 */
    	
    	Scanner input = new Scanner(System.in);
        int total = 200;
        int count = 0; 
        
        while(count < 4)
        {
        	//count++; 
        	
	    	System.out.println("Item\tValue");
	        System.out.println("1\t$239.99");
	        System.out.println("2\t$129.75");
	        System.out.println("3\t$99.95");
	        System.out.println("4\t$350.89"); 
	        
	        System.out.println("Current Compensation: " + total); 
	        System.out.println("Please select an item from the list above (or enter 0 to exit): ");
	        int number = input.nextInt();

		        if(number < 0 || number > 4)
		        {
		        	System.out.println("ERROR: Invalid input!");
		        }
		        else if( number == 1)
		        {
		        	System.out.println("Current compensation:" + (total += (.09 * 239.99))); 
		        }
		        else if( number == 2)
		        {
		        	System.out.println("Current compensation:" + (total += (.09 * 129.75))); 
		        }	        
		        else if( number == 3)
		        {
		        	System.out.println("Current compensation:" + (total += (.09 * 99.95))); 
		        }	        
		        else if( number == 4)
		        {
		        	System.out.println("Current compensation:" + (total += (.09 * 350.89))); 
		        }
		        else if (number == 0) //If the user provides invalid input (a value other than 0 - 4) display "ERROR: Invalid input!" and prompt them again
		        {
		        	System.out.println("Total earnings: " + total);
		        }
	        
        }

    }
    
}





















