package Assignment;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        int num1, num2, num3, temp, max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st num here: ");
        num1 = scanner.nextInt();
        System.out.println("Enter 2nd num here: ");
        num2 = scanner.nextInt();
        System.out.println("Enter 3rd num here: ");
        num3 = scanner.nextInt();

        temp = num1 > num2 ? num1 : num2;
        max = num3 > temp ? num3 : temp;

        System.out.println("The greatest number is " + max);
    }

}
