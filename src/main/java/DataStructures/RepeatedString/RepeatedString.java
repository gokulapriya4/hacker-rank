package main.java.DataStructures.RepeatedString;

public class RepeatedString {

    static long repeatedString(String s, long n) {
        return (n / s.length() * getNoOfOccuranceofCharacter(s, 'a')) +
                getNoOfOccuranceofCharacter(s.substring(0, (int) (n % s.length())), 'a');
    }

    public static long getNoOfOccuranceofCharacter(String s, char target) {
        return s.codePoints().filter(ch -> ch == target).count();
    }

    public static void main(String[] args) {
        String s = "afd";
        long n = 1;

        System.out.println(repeatedString(s, n));

    }
}
