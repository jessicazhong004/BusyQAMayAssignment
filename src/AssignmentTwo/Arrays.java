package AssignmentTwo;

public class Arrays {

    public static void main(String[] args) {


        //calculate sum and average values of an array
        int[] array = {1, 2, 3, 4, 8, 9, 14};
        System.out.println("The sum of array values is: " + getSumArray(array));
        System.out.println("The average of array values is: " + getAverageArray(array));

        System.out.println("=====");
        //print even and odd numbers in an array - ? simpler way?
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
        //missing number in an array
        int[] myMissArray = {1, 2, 3, 4, 8, 14};//9 removed
        int missingValue = getSumArray(array) - getSumArray(myMissArray);
        System.out.println("The missing num is " + missingValue);


        System.out.println("=====");
       //find greatest and smallest element in an array
        printMax(array);
        printMin(array);

        System.out.println("=========");
        //duplicate elements in an array
        int[] dupArray = {1, 2, 3, 4, 8, 9, 14, 3};
        printDupArray(dupArray);

    }

    public static int getSumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double getAverageArray(int[] arr) {
        double average = getSumArray(arr) / arr.length;
        return average;
    }

    public static void printMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("biggest number is " + max);
    }

    public static void printMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("smallest number is " + min);
    }

    public static void printDupArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print("dup element in the array: " + arr[j] + "\n");
                }
            }
        }
    }

}
