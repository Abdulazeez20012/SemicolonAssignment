package MN;

import java.util.ArrayList;

public class MissingInteger {
    ArrayList<Integer> missingNumbers = new ArrayList<>();

    public int[] findMissingInteger(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        }

        for (int i = 0; i < input.length - 1; i++) {
            int latest = input[i];
            int next = input[i + 1];

            for (int number = latest + 1; number < next; number++) {
                missingNumbers.add(number);
            }
        }

        int[] result = new int[missingNumbers.size()];
        for (int i = 0; i < missingNumbers.size(); i++) {
            result[i] = missingNumbers.get(i);
        }

        return result;
    }
}
