package Char04;

/**
 * 优先级队列 大的在下面
 */
public class PriorityQ {

    private int maxSize;
    private long[] array;
    private int nItems = 0;

    public PriorityQ(int size) {
        array = new long[size];
        maxSize = size;
    }

    public void insert(long item) {
        int i;

        if(nItems == 0)
            array[nItems++] = item;
        else {
            for(i=nItems-1; i>=0; i--) {
                if(item > array[i]) {
                    array[i+1] = array[i];
                } else {

                    break;
                }
            }

            array[i+1] = item;
            nItems++;
        }
    }

    public long remove() {
        return array[--nItems];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

}
