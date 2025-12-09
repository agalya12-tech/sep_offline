package com.excelR.ListProgram;

public class SingleLinkedListProgram {
    public static void main(String[] args) {
        SingleLinked<Integer>list=new SingleLinked<Integer>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.print();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.print();


    }
}

 class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

class SingleLinked<T> {


    private Node<T> head;
    private T  data;
    private int size;
    public SingleLinked() {
        this.head = null;
        this.data = null;
    }

    public boolean isEmpty() {
        return size==0;
    }
    public int size() {
        return size;
    }


    public void print(){
        if(isEmpty()){
            System.out.println("List is Empty");
        }
        else{
            Node<T>node=head;
            while(node!=null){
                System.out.print(node.data+"->");
                node=node.next;
            }
            head=node;
        }
    }




    public void add(T data){
         Node<T> current=new Node<>(data);
         if(head==null){
             head=current;
         }else{
              Node<T> node=head;
              while(node.next!=null){
                  node=node.next;
              }
              node.next=current;
         }
        size++;
    }
}