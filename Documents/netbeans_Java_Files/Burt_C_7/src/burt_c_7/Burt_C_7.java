// This program displays the average of a set of test scores 
package burt_c_7;

import javax.swing.JOptionPane;

public class Burt_C_7
{

    public static void main(String[] args) 
    {
        String numberOfScores, testScore;  
        int scores_Total, Score_Count;
        double actualTotal, testAverage;
        
        numberOfScores = JOptionPane.showInputDialog("Please enter The number of test entries you wish to enter: ");
        scores_Total = Integer.parseInt(numberOfScores);
        testAverage = 0;
        for ( Score_Count = 1; Score_Count <= scores_Total; Score_Count++ )
        {
            testScore = JOptionPane.showInputDialog(null, "Please enter test score # " + Score_Count );
            actualTotal = Double.parseDouble(testScore);
            testAverage = (actualTotal / Score_Count );     
        }
   
        JOptionPane.showMessageDialog (null, "The average of the test scores is: " + testAverage);
   

            
    }
    
}
