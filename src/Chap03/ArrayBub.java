package Chap03;

/**
 * bubbleSort 冒泡排序
 */
public class ArrayBub {

    private long[] nums;
    private int nElems;

    public ArrayBub(int max) {
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

    public void bubbleSort() {
        int outer=nElems-1;

        for(;outer>0;outer--) {
            for(int inner=0;inner<outer;inner++) {
                if(nums[inner] > nums[inner+1])
                    swap(inner, inner+1);
            }
        }
    }

    private void swap(int k, int j) {
        long temp = nums[k];
        nums[k] = nums[j];
        nums[j] = temp;
    }

}
