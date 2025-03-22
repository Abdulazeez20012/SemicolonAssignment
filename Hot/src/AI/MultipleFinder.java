package AI;

public class MultipleFinder {
    public int[] findMultiples(int a, int b, int c) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                result[index++] = i;
            }
        }
        return result;
    }
}
