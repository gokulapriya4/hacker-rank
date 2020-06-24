package main.java.DataStructures.TwoDArrays;

public class HourGlass {

    static int hourglassSum(int[][] arr) {
        Integer maximumSum = null;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                int hourGlassSum = (arr[i][j - 1] + arr[i][j] + arr[i][j + 1]) +
                        arr[i + 1][j] +
                        (arr[i + 2][j - 1] + arr[i + 2][j] + arr[i + 2][j + 1]);

                if (maximumSum == null) {
                    maximumSum = hourGlassSum;
                } else if (hourGlassSum > maximumSum) {
                    maximumSum = hourGlassSum;
                }
            }
        }
        return maximumSum;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        System.out.println(hourglassSum(arr));
    }
}
