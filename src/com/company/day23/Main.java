package com.company.day23;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        System.out.println(linkedList);


        for(Integer integer: linkedList) {
            System.out.print(integer + " -> ");
        }

    }
}
