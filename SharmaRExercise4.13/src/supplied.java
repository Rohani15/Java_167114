
/*
 * 4.19 (Sales Commission Calculator) A large company pays its salespeople on a commission basis. 
 * The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
 * salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5,000, or a total of $650. 
 * You’ve been supplied with a list of the items sold by each salesperson. The values of these 
 * items are shown in Fig. 4.33 . Develop a Java application that inputs one salesperson’s items sold for last 
 * week and calculates and displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.
 * 
Sample program (CommissionCalculator) console (System.out) output:
Item	Value
1	$239.99
2	$129.75
3	$99.95
4	$350.89
Current compensation: $200.00
Please select an item from the list above (or enter 0 to exit): -7
ERROR: Invalid input!
Item	Value
1	$239.99
2	$129.75
3	$99.95
4	$350.89
Current compensation: $200.00
Please select an item from the list above (or enter 0 to exit): 3
Item	Value
1	$239.99
2	$129.75
3	$99.95
4	$350.89
Current compensation: $209.00
Please select an item from the list above (or enter 0 to exit): 3
Item	Value
1	$239.99
2	$129.75
3	$99.95
4	$350.89
Current compensation: $217.99
Please select an item from the list above (or enter 0 to exit): 0
Total earnings: $217.99
 */

public class supplied 
{

	public static void main(String[] args)
	{
		int x = 10;
		int y = 5;

		if (y > y) {
		    y += y;
		} else if (y > x) {
		    y += x;
		} else {
		    x =- y;
		}
		System.out.printf("%d%d", x, y);
	}

}
