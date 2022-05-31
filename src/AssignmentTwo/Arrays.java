package AssignmentTwo;

public class Arrays {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 8, 9, 14};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;

        System.out.println("The sum of array values is: " + sum);
        System.out.println("The average of array values is: " + average);

        System.out.println("odd numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }

        System.out.println("even numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }

        System.out.println("=====");

        int[] missingNumArray = {1, 2, 3, 4, 8, 14};//9 removed
        int sumOfMissing = 0;
        for (int i = 0; i < missingNumArray.length; i++) {
            sumOfMissing += missingNumArray[i];
        }
        int missingValue = sum - sumOfMissing;
        System.out.println("The missing num is " + missingValue);


        System.out.println("=====");
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("biggest number is " + max);
        System.out.println("smallest number is " + min);


        System.out.println("=========");
        int[] dupArray = {1, 2, 3, 4, 8, 9, 14, 3};

        for (int i = 0; i < dupArray.length; i++) {
            for (int j = i + 1; j < dupArray.length; j++) {
                if (dupArray[i] == dupArray[j]) {
                    System.out.print("dup element in the array: " + dupArray[j] +"\n");
                }
            }
        }

    }
}
