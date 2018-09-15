// Burt, Christopher, Project #3

// This program prompts the user to enter the cost of a purchase
// and, depending on the total cost of the purchase, a discount and readjusted total is displayed.
package burt_c_3;
 
import java.util.Scanner;

public class Burt_C_3 
{
public static void main(String[] args)
    {
		
                  Double costOfPurchase, discount_5, discount_10;
                  Double final_Total_5, final_Total_10, toQualify; 
                  
		discount_5 = .05;
		discount_10 = .10;
                  		
		Scanner user_Input = new Scanner(System.in);
		// Find value of purchase
		System.out.println("What was the price of what you purchased?");
		costOfPurchase = user_Input.nextDouble();
		
		// Create if statement for parameters of discount
		if (costOfPurchase > 500)
                          {  
			final_Total_10 = costOfPurchase - (discount_10 * costOfPurchase);
                           System.out.print("Your total purchase, with discount, ");
                           System.out.printf("is: $%4.2f \n", final_Total_10);
                          }
		else if (costOfPurchase > 100)
                          {
                           final_Total_5 = costOfPurchase - (discount_5 * costOfPurchase);
			System.out.print("Your total purchase, with discount ");
                           System.out.printf("is: $ %4.2f \n", final_Total_5);
                          }
		else 
                          {
                           toQualify = 100 - costOfPurchase;
                           System.out.print("Your purchase does not qualify ");
                           System.out.print("for a discount, I'm sorry. \n\n");
                           System.out.print("If you were to spend ");
                           System.out.printf("$%4.2f, though, you would qualify.  Keep shopping!", toQualify);
                          }
    }
    
}
