package AssignmentOne;

import java.util.Scanner;

public class PosOrNeg {

    //get a number from the user and print whether it is positive or negative​
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Input Number: ");
        number = scanner.nextInt();
        scanner.close();

        if (number > 0) {
            System.out.println(number + " -> positive");
        } else if (number < 0) {
            System.out.println(number + " -> negative");
        } else {
            System.out.println(number + " -> other");
        }
    }
}
