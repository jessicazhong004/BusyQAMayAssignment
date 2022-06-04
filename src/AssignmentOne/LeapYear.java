package AssignmentOne;

import java.util.Scanner;

public class LeapYear {
    //year is a leap year or not
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number of year here: ");
        int year = scanner.nextInt();

        if (year >= 1 && year <= 9999) {
            if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
                System.out.println(year + " -> leap year");
            } else {
                System.out.println(year + " -> regular year");
            }
        } else {
            System.out.println(year + " -> regular year");
        }
    }
}
