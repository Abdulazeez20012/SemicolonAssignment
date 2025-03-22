package RP;

public class ReplaceArray {
    public static int[] IntArray (char[] charArray) {
        int[] intArray = new int[charArray.length];

        int i = 0;
        while (i < charArray.length) {
            if (charArray[i] == 'X') {
                intArray[i] = 1;
            } else {
                intArray[i] = 0;
            }
            i++;
        }

        return intArray;

    }

}