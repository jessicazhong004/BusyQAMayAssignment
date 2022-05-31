package AssignmentOne;

import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0;
        int days;

        System.out.println("Enter your month number here: ");
        month = scanner.nextInt();

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;

            default:
                days=0;
                break;
        }

        if(days!=0){
            System.out.printf("Number of days in %d month: %d\n",month,days);
        }else{
            System.out.printf("The number you entered is invalid. Please enter another month.\n");
        }
    }
}
