package murach.agecalculator;							//Luke Benitez

import java.util.Scanner;

public class AgeCalculatorApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Age Calculator\n");
        int LocalDate = 2020;
        // Get input from the the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dateOfBirthString = sc.nextLine();
        System.out.println();
        
        // Get and print user's date of birth
        System.out.println("Your date of birth is " + dateOfBirthString);

        // Get and print the current date
        System.out.println("The current date is " + LocalDate);
        int sum;
        //Calculate the user's age
        (LocalDate - dateOfBirthString <= sum);       
        //Print the user's age
        System.out.println("Your age is ");
        sc.close();
    }
}