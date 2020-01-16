package ch03_ex2;

import java.text.NumberFormat;
import java.util.Scanner;

public class AreaAndPerimeter {
	public static void main(String args[]) {
	System.out.println("Welcome to the Area and Perimeter Calculator.");
	
	Scanner sc = new Scanner(System.in);
    String choice = "y";
    while (choice.equalsIgnoreCase("y")) {
       
        System.out.print("Enter length: ");
        String productCode = sc.nextLine();
        String android = sc.nextLine();
        System.out.print("Enter width:     ");
        int width = Integer.parseInt(sc.nextLine());
	   
        double area;
        if (productCode.equalsIgnoreCase("100")) {
            area = 20000.000;
        } else if (productCode.equalsIgnoreCase("3")) {
            area = 300.00;
        } else if (productCode.equalsIgnoreCase("5.45")) {
            area = 54.50;
        } else {
            area = 0;
        }
       
        double total = area * width;

              NumberFormat currency = NumberFormat.getCurrencyInstance();
        String message = "\nLINE ITEM\n"
                + "Area:        " + productCode + "\n"
                + "Perimeter:    " + width + "\n";
        System.out.println(message);
	
	
	
        System.out.print("Continue? (y/n): ");
        choice = sc.nextLine();
        System.out.println();
    }
    sc.close();
    System.out.println("Bye!");
	
}
	}