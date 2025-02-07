import java.util.Arrays;

public class MySet {

    private int[] elements;
    private int size;

    public MySet(int size) {
        elements = new int[10];
        size = 0;
    }

    public MySet() {
        elements = new int[10];
        size = 0;


    }

    public void add(int element) {
        if (!contains(elements)) {
            if (size == elements.length) {
                elements = Arrays.copyOf(elements, elements.length * 2);
            }
        }


    }

    public int size() {
        return size;
    }

    public boolean contains(int elements) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == elements) {
                return true;
            }
        }
        return false;
    }

    public void remove(int element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];

            }
            size--;
        }

    }

    public boolean contains(int elements) {
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (elements[i] == elements) {
                result = true;
                break;
            }
        }
        return result;
    }

    public int size;
}
