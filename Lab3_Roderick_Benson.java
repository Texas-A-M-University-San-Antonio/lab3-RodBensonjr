//desc

//class header

import java.util.Scanner;

public class Lab3_Roderick_Benson
//curly braces
{
    public static void main(String[] args)
    {
        // Declaring a Scanner object for input 
        Scanner input = new Scanner(System.in);

        //step 2 Declaring the variables 
        double initialValue, interestRate, finalValue; // initial value of home, interest rate %, final value of home
        int years; //WHOLE YEARS NO DOUBLE number of elapsed years

        //prompting user inputs
        System.out.println("Enter the initial value of the home:");
        initialValue = input.nextDouble(); //elapsed years 
        
        System.out.println("Please enter the number of elapsed years: ");
        years = input.nextInt(); //reads an int
       
        System.out.println("Please enter the interest rate %:");
        interestRate = input.nextDouble(); //reads a double 

        //converting interest rate from % to decimal 

        interestRate = interestRate / 100.0;

        //Calculating final value using form: a =p * (1+r)^t

        finalValue = initialValue * Math.pow((1 + interestRate), years);

        //Output of the final value with 2 decimal places

        System.out.println("The final value of the home is: " + finalValue);


    }
}
