// Christopher Burt
// Project # 7
// This program displays the average of a set of test scores 
package burt_c_7;

import javax.swing.JOptionPane;

public class Burt_C_7
{
    public static void main(String[] args) 
    {
        String numberOfScores, testScore;  
        int scores_Total, Score_Count, total;
        double actualTotal, testAverage;
        //Get number of test entries
        numberOfScores = JOptionPane.showInputDialog("Please enter the number of scores you have to enter: ");
        scores_Total = Integer.parseInt(numberOfScores);
        // initialize global total for later average calculation 
        total = 0;
        // Gather test score info for # of test entries entered
        for ( Score_Count = 1; Score_Count <= scores_Total; Score_Count++ )
        {
            testScore = JOptionPane.showInputDialog(null, "Please enter test score # " + Score_Count );
            actualTotal = Double.parseDouble(testScore);
            total +=  actualTotal;
        }
        // Calculate and display the test average
        testAverage = (total / scores_Total );
        JOptionPane.showMessageDialog (null, "The average of the test scores you've entered is: " + testAverage);   
    }   
}

