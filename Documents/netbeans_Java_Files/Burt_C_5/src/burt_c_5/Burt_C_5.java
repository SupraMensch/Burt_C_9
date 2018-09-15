// Christopher Burt
// Project # 5

// This program calculates overtime for hours worked in excess of 40hrs, given an entered value.
package burt_c_5;
// Needed for user input
import javax.swing.JOptionPane;

public class Burt_C_5 
{
    public static void main(String[] args)
    {
        // variable declaration
        String wageInput, hoursInput;
        Double overTime, totalHours, hourlyWage, weeklySalary, overTimeWage, salaryPlusOvertime;
        Double overTimeCalc;
        // Gather wage data
        wageInput = JOptionPane.showInputDialog("Please enter the hourly wage of the employee: ");
        hourlyWage = Double.parseDouble(wageInput);
        //Gather hours worked data
        hoursInput = JOptionPane.showInputDialog("Please enter the hours worked by the employee: ");
        totalHours = Double.parseDouble(hoursInput);
        // variable intialization and math calculations 
        overTime = totalHours - 40;
        weeklySalary = 40 * hourlyWage;
        overTimeWage = hourlyWage * 1.5;
        overTimeCalc = overTime * overTimeWage;
        salaryPlusOvertime = weeklySalary + overTimeCalc;
        //Salary total Display
        JOptionPane. showMessageDialog(null, "The employee's salary, including overtime is: $" + salaryPlusOvertime);
     }
}
