package main.java.DataStructures.JumpingOnClouds;

public class JumpingOnColuds {

    static int jumpingOnClouds(int[] c) {
        int i = 0, steps = 0;

        while (i < c.length - 1) {
            if (i + 2 <= c.length - 1 && c[i + 2] == 0) {
                steps ++;
                i += 2;
            } else {
                steps ++;
                i++;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        int[] c = {0, 0, 0, 0, 1, 0};
        System.out.println(jumpingOnClouds(c));
    }

}
