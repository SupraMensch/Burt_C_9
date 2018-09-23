/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burt_c_9;
// Christopher Burt
// Project # 9

// This program converts celsius to Farenheit and displays the result as a table

import java.util.Scanner;
public class Burt_C_9
{

    // 1. Create a method that accepts the Celsius temperature as an argument and returns the Fahrenheit temperature.
    //2. In your main method, write a loop that that calls the method and passes it temperatures from 0 to 100 in increments of 10 (0, 10, 20, 30, etc.).
    //3. In this loop, display the Celsius and Fahrenheit equivalent as a table.
    public static void main(String[] args)
    {
        double celsius, fahrenheit;
         
        

    }  
    public static double celsiusToFarenheit(double fahrenheit)
    {
        double celsius;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the temperature in Celsius:");
        celsius = input.nextDouble();
        fahrenheit = celsius * 1.8 +32;
        System.out.println("The temperature in Fahrenheit is:" + fahrenheit);
        return celsius;
    }
    
}
