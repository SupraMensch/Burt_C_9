// Christopher Burt
// Project # 9

// This program converts celsius to Farenheit and displays the result as a table

package burt_c_9;

 // 1. Create a method that accepts the Celsius temperature as an argument and returns the Fahrenheit temperature.
 //2. In your main method, write a loop that that calls the method and passes it temperatures from 0 to 100 in increments of 10 (0, 10, 20, 30, etc.).
 //3. In this loop, display the Celsius and Fahrenheit equivalent as a table.

public class Burt_C_9     
{
    
    //Main method with loop that increments values 0 to 100
       public static void main(String[] args)
    {
       double celsius;
       //loop to increment by 10 for celsius
       System.out.println("Temperature Celsius:" + "                             " + "Temperature Fahrenheit:\n");
       for (double i = 0; i <= 100; i+=10)
           celsiusToFahrenheit(i);
      } 
    
    // Celsius to Fahrenheit converter Method
    public static double celsiusToFahrenheit(double celsius)
    {
        double celsiusToFahrenheit;
        celsiusToFahrenheit = celsius * 1.8 + 32;
        System.out.printf("%3.2f                                            %3.2f\n ", celsius, celsiusToFahrenheit);
        return celsius;
    }
    
}
