//  Christopher Burt
//  Project # 6

//  This program displays the numbers form 1 to 100 that are evenly divisible by 5.
package burt_c_6;

public class Burt_C_6 
{
    public static void main(String[] args) 
    {      
        // set control, test, and increment
        for (int divis5 = 5; divis5 <= 100; divis5++)
        {
        if (divis5 % 5 == 0)
        // Display output
        System.out.println(divis5 + "\t");
        }
    }
}
