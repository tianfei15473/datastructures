package Char04;

/**
 * 自定义栈
 */
public class Stack {

    private int maxSize; //栈最大值
    private long[] array;
    private int top = -1;//  顶部指针

    public Stack(int size) {
        array = new long[size];
        maxSize = size;
    }

    public void push(long j) {
        array[++top] = j;
    }

    public long pop() {
        return array[top--];
    }

    public long peek() {
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize-1;
    }

}
