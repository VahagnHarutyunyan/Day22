package com.company.day23;
import java.util.Iterator;

public class LinkedList implements List {

    int size;
    Node head;

    public LinkedList() {
    }

    class Node {
        int value;
        Node next;

        @Override
        public String toString() {
            return value + " -> " + next;
        }

        public Node(int value) {
            this.value = value;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    @Override
    public int get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        int i = 0;
        Node temp = head;
        while (i++ != index) {
            temp = temp.next;
        }
        return temp.value;
    }

    @Override
    public void add(int val) {
        if (size == 0) {
            head = new Node(val);
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new Node(val);
        }
        size++;
    }

    @Override
    public void add(int index, int val) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(val);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }
        size++;
    }

    @Override
    public void delete(int index) throws IndexOutOfBoundsException {
        if (index == 0) {
            head = head.next;
        } else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        size--;
    }

    @Override
    public String toString() {
        return "[" + head + ']';
    }


    @Override
    public Iterator<Integer> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<Integer> {
        private int index;
        Node tempNode = head;


        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Integer next() {
            Integer value = tempNode.value;
            tempNode = tempNode.next;
            index++;
            return value;
        }
    }
}
