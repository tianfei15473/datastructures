package Chap03;

public class ArraySelect {

    private long[] nums;
    private int nElems;

    public ArraySelect(int max) {
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

    public void selectSort() {
        int outer = 0;
        for(; outer<nElems-1;outer++) {
            int min = outer;
            for(int inner=outer+1;inner<nElems;inner++) {
                if(nums[min] > nums[inner])
                    min = inner;
            }

            swap(outer, min);
        }
    }

    private void swap(int k, int j) {
        long temp = nums[k];
        nums[k] = nums[j];
        nums[j] = temp;
    }

}
