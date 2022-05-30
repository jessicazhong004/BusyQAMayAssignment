package Assignment;

import java.util.Scanner;

public class NumDigits {
    public static void main(String[] args) {
        int num, count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number here: ");
        num = scanner.nextInt();
        int origin = num;

//        for (count = 0; num > 0; num = num / 10) {
//            count = count + 1;
//        }

        while (num != 0) {
            num /= 10;
            ++count;
        }
        System.out.printf("number of digits of %d is %d",origin, count);
    }


}
