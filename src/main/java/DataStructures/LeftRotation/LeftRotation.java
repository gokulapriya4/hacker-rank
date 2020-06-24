package main.java.DataStructures.LeftRotation;

public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {
        for (int i = 1; i <= d; i++) {
            int zerothElement = a[0];
            for (int j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[a.length - 1] = zerothElement;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int d = 1;

        int[] afterRotation = rotLeft(a, d);
        for (int i : afterRotation) {
            System.out.println(i);
        }
    }
}
