package murach.lineitem;

import java.text.NumberFormat;
import java.util.Scanner;

public class LineItemApp {

    public static void main(String args[]) {
        System.out.println("Welcome to the Line Item Calculator");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input from user
            System.out.print("Enter product code: ");
            String productCode = sc.nextLine();
            String android = sc.nextLine();
            System.out.print("Enter quantity:     ");
            int quantity = Integer.parseInt(sc.nextLine());

            // set product price based on product code
            double price;
            if (productCode.equalsIgnoreCase("java")) {
                price = 57.50;
            } else if (productCode.equalsIgnoreCase("jsp")) {
                price = 57.50;
            } else if (productCode.equalsIgnoreCase("mysql")) {
                price = 54.50;
            } else {
                price = 0;
            }
            {//TEACHER NOTES: this open curly brace is extra and not needed
            
             // TEACHER NOTES: notice how this if/else block is so similar to the above one...
             // that means you should incorporate this in the above block instead of
             // having duplicates.
            if (android.equalsIgnoreCase("android")) {
                    price = 60.00;
                } else if (android.equalsIgnoreCase("jsp")) {
                    price = 56.39;
                } else if (android.equalsIgnoreCase("mysql")) {
                    price = 54.78;
                } else {
                    price = 0;
                }
            }//TEACHER NOTES:this closing curly brace is extra and not needed
            
            // calculate total
            double total = price * quantity;

            // format and display output
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            String message = "\nLINE ITEM\n"
                    + "Code:        " + productCode + "\n"
                    + "Description:  Murach's Java Programming" +"\n"
                    + "Price:       "  + "\n"
                    + "Quantity:    " + quantity + "\n"
                    + "Total:       " +   "\n";
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
        System.out.println("Bye!");
    }
}
