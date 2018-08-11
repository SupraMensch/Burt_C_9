/**
 *Christopher Burt, Project #1
 * 
 * Create an application that inputs user's full name and displays in specific format.
 * 
*/

package burt_c_1;

/**
 * Import Scanner class from Java.util
*/
import java.util.Scanner;



public class Burt_C_1 {

    public static void main(String[] args) {
        
        /**  Using scanner takes input form keyboard
         *  test
         * .next after 'user_input" moves to next token 
        */
        Scanner user_input = new Scanner(System.in);
        
        String first_name, middle_name, last_name, entire_name;
        
        System.out.print("Enter your first name: ");
        first_name = user_input.next();
        
        System.out.print("Enter your middle name: ");
        middle_name = user_input.next();
        
        System.out.print("Enter your last name: ");
        last_name = user_input.next();
        
        entire_name = last_name + ", " + first_name + " " + middle_name;
        
        System.out.println("Your name is: " + entire_name);
        
        
        
    }

    
    
}
