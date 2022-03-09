package com.company.task2;

public class DefaultStack implements Stack {
    private int[] nums = new int[getMAX_SIZE()];
    private int index;

    DefaultStack() {
        index = -1;
    }

    public int[] getNums() {
        return nums;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getMAX_SIZE() {
        return 5;
    }

    @Override
    public boolean push(int val) {
        if (index == getMAX_SIZE()-1) {
            throw new StackIndexOutOfBoundsException();
        }
        nums[++index] = val;
        return true;
    }

    @Override
    public int pop() {
        if (index == -1) {
            throw new EmptyStackException();
        }
        return nums[index--];
    }

    public void print() {
        for (int i = index; i > -1; i--) {
            System.out.println(nums[i] + " ");
        }
    }
}
