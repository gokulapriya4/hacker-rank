package main.java.DataStructures.countingValleys;

public class CountingValleys {

    static int countingValleys(int n, String s) {
        int counter = 0, noOfValleyCrossed = 0;
        boolean hasEnteredBelowSseaLevel = false;

        for (String s1 : s.split("")) {

            if (!hasEnteredBelowSseaLevel) {
                if (counter < 0) {
                    hasEnteredBelowSseaLevel = true;
                } else {
                    if (s1.equals("U")) {
                        counter++;
                    } else {
                        counter--;
                    }
                }
            }

            if (hasEnteredBelowSseaLevel) {
                if (s1.equals("U")) {
                    counter++;
                } else {
                    counter--;
                }

                if (counter == 0) {
                    noOfValleyCrossed++;
                    hasEnteredBelowSseaLevel = false;
                }
            }

        }
        return noOfValleyCrossed;
    }

    public static void main(String[] args) {
        int n = 8;
        String s = "DUDUDU";
        int i = countingValleys(n, s);
        System.out.println(i);
    }
}
