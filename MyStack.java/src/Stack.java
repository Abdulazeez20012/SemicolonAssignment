import java.util.EmptyStackException;

public class Stack {
    private int[] stackArray;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1;
    }


    public void TOpush(int element) {
        if (top == capacity - 1) {
            throw new StackOverflowError("Stack Overflow!");
        } else {
            stackArray[++top] = element;
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new StackOverflowError ("Stack Underflow!");
        } else {
            return stackArray[top--];
        }
    }

    public int Topeek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }


    public int sizeOfStack() {
        return top + 1;
    }

    public int size() {
        return sizeOfStack();

    }
}
