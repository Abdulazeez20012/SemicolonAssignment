import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MapTest {
    @Test
    public void testTo_PutKeyAndValue_AndGetKeyAndValue() {
        Map map = new Map();
        map.put("mango", 1);
        map.put("agbalumo", 2);
        assertEquals(1, map.get("mango"));
        assertEquals(2, map.get("agbalumo"));
    }

    @Test
    public void testTo_GetNonExistingKey() {
        Map map = new Map();
        assertNull(map.get("banana"));
    }

    @Test
    public void testContainsKey() {
        Map map = new Map();
        map.put("apple", 1);
        assertTrue(map.containsKey("apple"));
        assertFalse(map.containsKey("orange"));
    }

    @Test
    public void testRemoveKey() {
        Map map = new Map();
        map.put("apple", 1);
        map.put("orange", 2);
        map.remove("apple");
        assertNull(map.get("apple"));
        assertEquals(2, map.get("orange"));
    }

    @Test
    public void testSize() {
        Map map = new Map();
        map.put("apple", 1);
        map.put("orange", 2);
        map.put("cherry", 3);
        assertEquals(3, map.size());
    }

}
