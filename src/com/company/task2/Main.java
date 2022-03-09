package com.company.task2;

public class Main {
    public static void main(String[] args) {
        DefaultStack stack = new DefaultStack();
//        stack.pop();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.print();
        System.out.println("--------------------------");
        stack.pop();
        stack.pop();
        stack.print();
        System.out.println("+++++++++++++++++++++++++++");
        stack.push(55);
        stack.print();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

    }
}
