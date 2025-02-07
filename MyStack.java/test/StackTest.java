import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void testPush() {
        Stack stack = new Stack(5);
        stack.TOpush(10);
        assertEquals(1, stack.size());
    }

    @Test
    void testStack_WhenPop() {
        Stack stack = new Stack(5);
        stack.TOpush(10);
        int poppedElement = stack.pop();
        assertEquals(10, poppedElement);
        assertTrue(stack.isEmpty());
    }

    @Test
    void testStack_whenWePeek() {
        Stack stack = new Stack(5);
        stack.TOpush(10);
        stack.TOpush(20);
        assertEquals(20, stack.Topeek());
    }

    @Test
    void testThatStack_IsEmpty() {
        Stack stack = new Stack(5);
        assertTrue(stack.isEmpty());
        stack.TOpush(10);
        assertFalse(stack.isEmpty());
    }

    @Test
    void testTheStack_Size() {
        Stack stack = new Stack(5);
        stack.TOpush(10);
        stack.TOpush(20);
        stack.TOpush(30);
        assertEquals(3, stack.size());
    }

    @Test
    void testTheStack_ByFindingElementBy_Index() {
        Stack stack = new Stack(5);
        stack.TOpush(10);
        stack.TOpush(20);
        stack.TOpush(30);
        assertEquals(30, stack.Topeek());

    }
}
