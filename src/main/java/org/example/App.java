/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Avery Reyna
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        // this asks the user to input what they'd like to convert
        Scanner input = new Scanner(System.in);
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");
        String conversion = input.next();

        int convertedTemperature = 0;

        // these if statements take into account both uppercase and lowercase inputs for temperature type
        if (conversion.equals("C") || conversion.equals("c"))
        {
            Scanner input2 = new Scanner(System.in);
            System.out.print("Please enter the temperature in Celcius: ");
            int temperature = Integer.parseInt(input2.nextLine());
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.println(String.format("Your temperature in Fahrenheit is %d.", convertedTemperature));
        }
        else if (conversion.equals("F") || conversion.equals("f"));
        {
            Scanner input3 = new Scanner(System.in);
            System.out.print("Please enter the temperature in Fahrenheit: ");
            int temperature = Integer.parseInt(input3.nextLine());
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.println(String.format("Your temperature in Celcius is %d.", convertedTemperature));
        }
    }
}
