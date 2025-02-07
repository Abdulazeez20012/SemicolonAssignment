package Dsa;

import java.util.ArrayList;

public class Arraylist {

    private ArrayList<String> arraylist;
    private int size;

    public Arraylist() {
        arraylist = new ArrayList<>();
        size = 0;
    }
    public boolean isEmpty(String element) {
        arraylist.add(element);
        return false;
    }

    public boolean add(String element) {
        arraylist.add(element);
        arraylist.add(element);
        arraylist.add(element);
        size++;
        return true;
    }

    public boolean remove(String azeez) {
        arraylist.remove(azeez);
        size--;
        return false;
    }

    public int size() {
        return size;
    }

    public void get(String dozman) {
        arraylist.get(3);


    }
}
