package murach.name;

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        int index = name.indexOf(" ");
        String firstName = name.substring(0, index);
        String middleName = name.substring(index + 1);
        String lastName = name.substring(index + 2);
        System.out.println("First name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last name: " + lastName);
        sc.close();
    }
}
