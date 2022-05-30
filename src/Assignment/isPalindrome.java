package Assignment;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number here: ");
        num = scanner.nextInt();

        if (num < 0 || num != 0 && num % 10 == 0) {
            System.out.println("Not a palindrome number.");
        }

        int reversed = 0;
        int original = num;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        if(original==reversed){
            System.out.printf("%d is a palindrome number.", original);
        } else {
            System.out.println("Not a palindrome number.");
        }

    }
}
