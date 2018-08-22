/**
*Christopher Burt, Project #1
* 
* Create an application that inputs user's full name and displays in specific format.
* 
*/
package burt_c_1;


import java.util.Scanner;  //Needed for Scanner class

public class Burt_C_1 
{
    public static void main(String[] args) 
    {
        String first_Name, middle_Name, last_Name, entire_Name;
        
        /**  Using scanner takes input from keyboard
        *   .next after 'user_input" moves to next token 
        */
        //Scanner object for input
        Scanner user_input = new Scanner(System.in);
                       
        //Gather user info
        System.out.print("Enter your first name: ");
        first_Name = user_input.next();
        
        System.out.print("Enter your middle name: ");
        middle_Name = user_input.next();
        
        System.out.print("Enter your last name: ");
        last_Name = user_input.next();
        
        entire_Name = last_Name + ", " + first_Name + " " + middle_Name; 
        
        //Display information back to the user
        System.out.println("Your name is: " + entire_Name);        
    }
}
