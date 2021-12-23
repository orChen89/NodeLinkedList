package com.or.linkedlist;

public class LinkedList <T> {

    private Node <T> headNode;

    public LinkedList(Node <T> headNode) {
        this.headNode = headNode;
    }

    public void add(T data) {
        Node<T> current = headNode;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new Node<T>(data));
    }

    public Node <T> recursiveAdd(T data) {

        Node<T> current = headNode;
        while (current.getNext() != null){
            current = current.getNext();
        }
         if(current.getNext() == null) {
           current.setNext(new Node<T>(data));
           return current;
        }
           return recursiveAdd(data);
    }

    public Node <T> recursiveRemove(T data) {

        Node<T> temp = headNode;
        Node<T> prev = null;

        while (temp != null && temp.getData() != data) {
            prev = temp;
            temp = temp.getNext();
        }
        if (temp != null && temp.getData() == data) {
            prev.setNext(temp.getNext());
            return prev;
        }
        return recursiveRemove(data);
    }

  public void remove (T data) {

      Node<T> temp = headNode;
      Node<T> prev = null;

        if (temp != null && temp.getData() == data) {
            headNode = temp.getNext();
            return;
        }
        while (temp != null && temp.getData() != data) {
            prev = temp;
            temp = temp.getNext();
        }
        if (temp == null) {
            return;
        }
        prev.setNext(temp.getNext());
    }

  public void print() {

     Node<T> current = headNode;
     while (current.getNext() != null) {
       System.out.print("[" + current.getData() + "] " + "==> ");
       current = current.getNext();
     }
     System.out.print("[" + current.getData() + "] ");
   }
 }

