package MN;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumber {

    public int[] findMissingIntegers(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        }

        Arrays.sort(input); // Sorting the array to make sure the integers are in order.
        ArrayList<Integer> missingIntegers = new ArrayList<>();
        int expectedNumber = input[0];

        for (int i = 0; i < input.length; i++) {
            while (expectedNumber < input[i]) {
                missingIntegers.add(expectedNumber);
                expectedNumber++;
            }
            expectedNumber++;
        }

        return missingIntegers.stream().mapToInt(Integer::intValue).toArray();
    }
}

