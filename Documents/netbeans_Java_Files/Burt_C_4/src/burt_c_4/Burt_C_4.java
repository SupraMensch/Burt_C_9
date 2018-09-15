//  Christopher Burt
// Project#4

//  Ths program classifies packages by weight
package burt_c_4;

import javax.swing.JOptionPane;

public class Burt_C_4 
{
    public static void main(String[] args) 
    {
        //variable declaration
        Double package_Weight;
        String user_Input;
        //Gather user input
        user_Input = JOptionPane.showInputDialog("Please enter the weight of the package ");
        package_Weight = Double.parseDouble(user_Input);
        
        // If else logic and claissification display
        if (package_Weight < 5)
        {
            JOptionPane.showMessageDialog(null, "Your package is in Weight Class #1");
        }
        else
        {
            if (package_Weight < 20)
            {
                JOptionPane.showMessageDialog(null, "Your package is in Weight Class #2");
            }
            else
            {
                if (package_Weight < 50)
                {
                  JOptionPane.showMessageDialog(null, "Your package is in Weight Class #3");
                }
                else
                {
                    if (package_Weight < 250)
                    {
                        JOptionPane.showMessageDialog(null, "Your package is in Weight Class #4");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Your package is in Weight Class #5");
                    }
                }
            }
              
        }
    }
}
