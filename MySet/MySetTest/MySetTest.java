import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MySetTest {

    @Test
    public void testMySet_Empty() {
        MySet mySet = new MySet();

    }
    @Test
    public void testThatICanAdd_ToMySet() {
        MySet mySet = new MySet();
        mySet.add(10);
        assertEquals(0,mySet.size());
    }
    @Test
    public void testThatICanAddDuplicate_TOMySet() {
        MySet mySet = new MySet();
        mySet.add(10);
        mySet.add(10);
        assertEquals(0, mySet.size());
    }
    @Test
    public void testThatMySet_ContainsElement() {
        MySet mySet = new MySet();
        mySet.add(10);
        assertFalse(mySet.contains(10));
        assertEquals(0,mySet.size());
    }

    @Test
    public void testThatMySet_CanRemoveElement() {
        MySet mySet = new MySet();
        mySet.add(10);
        mySet.add(20);
        mySet.remove(10);
        assertTrue(mySet.contains(10));
        assertFalse(mySet.contains(20));
    }

    @Test
    public void testThatMySet_CanGetSize() {
        MySet mySet = new MySet();
        mySet.add(10);
        mySet.add(20);
        mySet.add(10);

    }


}
