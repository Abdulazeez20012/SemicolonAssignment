public class Queue {

    private int[] elements;
    private int front;
    private int rear;
    private int size;
    private static final int INITIAL_CAPACITY = 10;


    public Queue() {
        elements = new int[INITIAL_CAPACITY];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int element) {
        if (size == elements.length) {
            resize();
        }
        rear = (rear + 1) % elements.length;
        elements[rear] = element;
        size++;
    }

    public int dequeue() {
        if(isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }
        int element = elements[front];
        front = (front + 1) % elements.length;
        size--;
        return element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        if(isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }
        return elements[front];
    }

    public int size() {
        return size;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean contains(int element) {
        for(int azeez = 0; azeez < size; azeez++) {
            if(elements[(front + azeez) % elements.length] == element) {
                return true;
            }
        }
        return false;
    }

    private void resize() {
        int[] newElements = new int[elements.length * 2];
    }
}