package Char04;

/**
 * 自定义循环队列
 */
public class Queue {

    private int front = 0; //头指针
    private int rear = -1; //尾部指针
    private long[] array;
    private int nItems = 0; //数组数量
    private int maxSize = 0;//最大数据量

    public Queue(int size) {
        array = new long[size];
        maxSize = size;
    }

    public void insert(long j) {
        if(rear == maxSize-1) //如果尾部指针已经到了最后一位
            rear = -1;

        array[++rear] = j;
        nItems++;
    }

    public long remove() {
        long temp = array[front++];
        if(front == maxSize)
            front = 0;

        nItems--;
        return temp;
    }

    public long peekFront() {
        return array[front];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public int size() {
        return nItems;
    }

}
