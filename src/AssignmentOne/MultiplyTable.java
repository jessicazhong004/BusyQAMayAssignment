package AssignmentOne;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number here: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d*%d=%d\n", num, i, num * i);
        }


    }
}
