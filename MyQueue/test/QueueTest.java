import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    @Test
    public void test_To_Enqueue() {
        Queue queue = new Queue();
        queue.enqueue(10);
        assertEquals(1, queue.size());
    }

    @Test
    public void test_To_Dequeue() {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        int dequeued = queue.dequeue();
        assertEquals(10, dequeued);
        assertEquals(1, queue.size());
    }

    @Test
    public void test_To_Peek() {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        assertEquals(10,queue.peek());
    }


    @Test
    public void test_To_GetSize() {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        assertEquals(3, queue.size());

    }

    @Test
    public void test_To_IsEmpty() {
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
        queue.enqueue(10);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void test_To_ClearElement_In_Queue() {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.clear();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void test_To_Check_if_QueueContainsElement() {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        assertTrue(queue.contains(10));
        assertFalse(queue.contains(40));
    }

    @Test
    public void test_To_Resize_Queue() {
        Queue queue = new Queue();
        for (int index = 0; index < 15; index++) {
            queue.enqueue(index);
        }
        assertEquals(15, queue.size());
    }



}