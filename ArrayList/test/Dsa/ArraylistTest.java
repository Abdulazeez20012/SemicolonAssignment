package Dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArraylistTest {

    @Test
    public void testThatArraylistIsEmpty() {
        Arraylist arraylist = new Arraylist();
        assertFalse(arraylist.isEmpty("azeez"));
    }

    @Test
    public void testThatArraylistCanAddElement() {
        Arraylist arraylist = new Arraylist();
        arraylist.add("azeez");
        assertTrue(arraylist.add("azeez"));
    }

    @Test
    public void testThatArraylistCanRemoveElement() {
        Arraylist arraylist = new Arraylist();
        arraylist.add("azeez");
        arraylist.remove("azeez");
        assertFalse(arraylist.remove("azeez"));
    }

    @Test
    public void testThatArraylistCanAddMultipleElements() {
        Arraylist arraylist = new Arraylist();
        arraylist.add("azeez");
        arraylist.add("stephen");
        arraylist.add("musa");
        arraylist.add("dozman");
        assertEquals(4,arraylist.size());

    }

    @Test
    public void testToGetElementFromArraylist() {
        Arraylist arraylist = new Arraylist();
        arraylist.add("azeez");
        arraylist.add("stephen");
        arraylist.add("musa");
        arraylist.add("dozman");
        arraylist.get("dozman");
        assertEquals(0,arraylist.get(3));
    }
}
