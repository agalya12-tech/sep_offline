package com.excelR.ListProgram;

public class SingleLinkedListProgram {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.display();
        list.display();





    }
}

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

}


class SinglyLinkedList<T> {
    Node<T> head;
    int size;
    T data;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T data) {
        Node<T> current = new Node<T>(data);
        if (head == null) {
            head = current;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = current;
        }
        size++;
    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");


    }

}


