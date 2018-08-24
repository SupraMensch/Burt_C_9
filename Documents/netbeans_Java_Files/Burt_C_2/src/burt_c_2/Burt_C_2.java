// Burt, Christopher Project#2

// This program prompts the user for the cost of a meal and then calculates and displays 
// three different percentage tip types

package burt_c_2;

import java.util.Scanner; 
public class Burt_C_2
{

        public static void main(String[] args) 
    {
			
        double tip_15, tip_18, tip_20;// variable declaration		 
        double bill_Amount;
        double tip_15WithBill, tip_18WithBill, tip_20WithBill;
       
        Scanner userInput = new Scanner(System.in);
        //Gather user input and display
        System.out.print("Please enter the bill total for your meal: $ ");
        bill_Amount = userInput.nextDouble();
        
        tip_15 = .15 * bill_Amount;
        tip_15WithBill = tip_15 + bill_Amount;
        System.out.printf("\nThe tip at 15 percent is: $ %4.2f \n", tip_15 );
        System.out.printf("The bill with a 15 percent tip is: $ %4.2f \n \n", tip_15WithBill );
        
        
        tip_18 = .18 * bill_Amount;
        tip_18WithBill = tip_18 + bill_Amount;
        System.out.printf("\nThe tip at 18 percent is: $ %4.2f \n", tip_18 );
        System.out.printf("The bill with an 18 percent tip is: $%4.2f \n", tip_18WithBill );
        
        
        tip_20 = .20 * bill_Amount;
        tip_20WithBill = tip_20 + bill_Amount;
        System.out.printf("\nThe tip at 20 percent is: $ %4.2f \n", tip_20 );
        System.out.printf("The bill with a 20 percent tip is: $ %4.2f \n", tip_20WithBill );        
      
            
        
              
    }
    
}


