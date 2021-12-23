package com.or.linkedlist;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>(new Node <>(12));

        ll.add(13);
        ll.add(5);
        ll.add(-4);
        ll.add(22);
        ll.add(3);
        ll.add(0);
        ll.add(11);
        ll.print();
        System.out.println();
        System.out.println();

        ll.remove(22);
        ll.remove(5);
        ll.print();
        System.out.println();
        System.out.println();

        ll.recursiveAdd(3);
        ll.recursiveAdd(6);
        ll.recursiveAdd(1);
        ll.print();

        System.out.println();
        System.out.println();

        ll.recursiveRemove(1);
        ll.print();

    }
}
