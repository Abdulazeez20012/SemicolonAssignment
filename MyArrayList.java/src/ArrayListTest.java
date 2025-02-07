import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListTest {
    @Test
    public void testThatArrayListIsEmpty() {
        ArrayList arrayList = new ArrayList();

    }

    @Test
    public void testThatArrayListIsNotEmpty() {
        ArrayList arrayList = new ArrayList();

    }

    @Test
    public void testThatArrayListContainsObject() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Object());
        assertEquals(1, arrayList.size());
    }

    @Test
    public void testThatArrayListContainsNull() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        assertEquals(1, arrayList.size());
    }
}