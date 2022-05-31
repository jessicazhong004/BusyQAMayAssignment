package AssignmentTwo;

public class TwoDiArrays {
    public static void main(String[] args) {

        //question: When is this logic used in real scenario?
        int[][] score = {{75, 65, 88}, {33, 71, 90}};
        int[] sum = new int[2];

        sum[0] = 0;
        sum[1] = 0;
        float[] average = new float[2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i] += score[i][j];
            }
        }

        average[0] = (float) sum[0] / 3;
        average[1] = (float) sum[1] / 3;

        System.out.println("Average score of Student One is " + average[0]);
        System.out.println("Average score of Student Two is " + average[1]);



    }
}

