import java.util.Scanner;

public class Science_windChillTemperature {
    public static void main(String[] args)   {

        /* The task will be performed in three steps
        1) Prompting for user input and declaring/assigning variables
        2) Calculating results
        3) Printing results
         */

        // 1) Prompting and setting up variables
        Scanner input = new Scanner(System.in); // We need a scanner

        System.out.print(
                "Please enter temperature between -58\u2109 and 41\u2109: "
        );
        double temperature = input.nextDouble();

        System.out.print(
                "Please enter wind speed faster than 2 miles/hour: "
        );
        double windSpeed = input.nextDouble();

        // Calculating results
        double result = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);

        // Displaying results
        System.out.print(
                "The chill index factor is: " + result
        );
    }
}
