package Assignment;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        int num, reverse = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number here: ");
        num = scanner.nextInt();
        int original = num;

        while (num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }

        System.out.printf("Reverse of %d -> %d", original, reverse);

    }
}
