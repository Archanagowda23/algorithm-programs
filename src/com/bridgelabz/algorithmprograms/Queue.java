package com.bridgelabz.algorithmprograms;

public class Queue<T extends Comparable<T>> {
    Node<T> head;
    Node<T> tail;

    public void Deque() {
        head = null;
    }
    public Queue() {
        head = null;
    }


    public void enqueue(T item) {
        Node<T> node = new Node<T>(item);
        if (head == null) {
            head = node;
            head.next = null;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            node.next = null;
        }

    }
    public void disp() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public T dequeue() {
        Node<T> temp = head;
        if (head == null) {
            System.out.println("queue is empty");
            return null;
        }

        head = head.next;
        return (T) temp.data;

    }

    public void addFront(T item) {
        Node<T> node = new Node<T>(item);
        node.next = head;
        head = node;

    }

    public T removeFront() {
        T data = dequeue();
        return data;
    }

}
