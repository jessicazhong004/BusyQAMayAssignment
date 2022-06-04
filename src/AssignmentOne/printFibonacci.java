package AssignmentOne;

public class printFibonacci {
    //Fibonacci
    public static void main(String[] args) {

        //overflow

        //array
//       int[] arr = new int[50];
//        arr[0] = 1;
//        arr[1] = 1;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i > 1) {
//                arr[i] = arr[i - 2] + arr[i - 1];
//            }
//            System.out.printf("%d) %d\n",i+1,arr[i]);
//        }

        //for loop
        int a = 1;
        int b = 1;
        int c = 0;

        System.out.print("1) " + a + "\n" + "2) " + b + "\n");

        for (int i = 3; i <= 50; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(i + ") " + c);
        }


    }
}
