public class Map {
    private String[] keys;
    private Integer[] values;
    private int size;

    public Map() {
        keys = new String[10];
        values = new Integer[10];
        size = 0;
    }
    public void put(String key, Integer value) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                values[i] = value;
                return;
            }
        }
        if (size == keys.length) {
            resize();
        }
        keys[size] = key;
        values[size] = value;
        size++;

    }

    private void resize() {
    }

    public Integer get(String key) {
        for (int index = 0; index < size; index++) {
            if (keys[index].equals(keys)) {
                return values[index];
            }
        }
        return null;
    }
    public boolean containsKey(String key) {
        for (int index = 0; index < size; index++) {
            if (keys[index].equals(keys)) {
                return true;

            }
        }
        return false;
    }

    public void remove(String key) {
        for (int index = 0; index < size; index++) {
            if (keys[index].equals(keys)) {
                System.arraycopy(keys, index + 1, keys, index, size - index - 1);
                size--;
                return;
            }
        }
    }

    public int size() {
        return size;
    }
}
