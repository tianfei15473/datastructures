package Chap03;

public class ArrayInsert {
    private long[] nums;
    private int nElems;

    public ArrayInsert(int max) {
        nums = new long[max];
        nElems = 0;
    }

    public void insert(long num) {
        nums[nElems] = num;
        nElems++;
    }

    public void display() {
        for(long i : nums) {
            System.out.print("  " + i);
        }

        System.out.println("");
    }

    public void insertSort() {
        int inner,outer;
        for(outer=1;outer<nElems;outer++) {
            inner = outer;
            long temp = nums[outer];
            while(inner > 0 && nums[inner-1] > temp) {
                nums[inner] = nums[inner-1];
                inner--;
            }
            nums[inner] = temp;
        }
    }

    private void swap(int k, int j) {
        long temp = nums[k];
        nums[k] = nums[j];
        nums[j] = temp;
    }

}
