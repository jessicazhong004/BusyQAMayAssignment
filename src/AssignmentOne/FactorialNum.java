package AssignmentOne;

import java.util.Scanner;

public class FactorialNum {
    //factorial
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number here: ");
        num = scanner.nextInt();

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.printf("Factorial of %d is %d", num, fact);

    }
}
