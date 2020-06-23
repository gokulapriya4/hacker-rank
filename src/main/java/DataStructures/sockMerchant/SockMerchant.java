package main.java.DataStructures.sockMerchant;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Long> collect = Arrays.stream(ar).boxed().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        return ((int) collect.values().stream().map(value -> value / 2).mapToLong(e -> e).sum());
    }

    public static void main(String[] args) {
        int n = 3;
        int[] ar = {1, 2, 1};
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
