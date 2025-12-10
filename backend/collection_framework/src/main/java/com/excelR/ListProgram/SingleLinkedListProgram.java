package com.excelR.ListProgram;

public class SingleLinkedListProgram {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(11);
        list.add(2);
        list.add(3);
        System.out.println(list.size());
        System.out.println(list.isEmpty());






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


    public T get(int index){
        if(index<0||index>size){ throw new IndexOutOfBoundsException("index out of bounds"); }
        Node<T>current=head;
        for(int i=0;i<index;i++){
            current=current.next;
        }
        return current.data;
    }
    public void print(){
        if(isEmpty()){ System.out.println("List is empty");  }
        else{
            Node<T>temp=head;
            while(head!=null){
                System.out.print(head.data+"->");
                head=head.next;
            }
            head=temp;
            System.out.println("null");
        }

    }
    public void set(int index, T data) {
        if (index<0 || index>size){ throw new IndexOutOfBoundsException("index out of bounds"); }
        else{
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.data = data;}
    }

}
